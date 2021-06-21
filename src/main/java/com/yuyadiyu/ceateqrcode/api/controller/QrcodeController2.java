package com.yuyadiyu.ceateqrcode.api.controller;

import com.google.zxing.Result;
import com.yuyadiyu.ceateqrcode.api.util.QRCodeUtil;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;

/**f
 * 二维码调用前端控制器
 */

@RestController
public class QrcodeController2 {

    /**
     * 生成二维码
     * @return
     */
    @RequestMapping(value = "/creatQRCode",method = RequestMethod.GET,produces=MediaType.IMAGE_PNG_VALUE)
    public void productcode(HttpServletResponse resp) throws IOException {
        QRCodeUtil.zxingCodeCreate("http://www.baidu.com", "E://idea_create_file/QRCode/",500,"C:/Users/Administrator/Desktop/Adesktop-img//resource-file//sunflower//sunflower015.jpg");



    }


    /**
     * 解析二维码
     */
    @GetMapping("/test")
    public void analysiscode() {
        Result result = QRCodeUtil.zxingCodeAnalyze("E://idea_create_file/QRCode/379.jpg");
        System.err.println("二维码解析内容："+result.toString());
    }

}