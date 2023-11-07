package com.kaifamiao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

@Controller
public class FileUploadController {
    @PostMapping("/fileUpload")
    public String testResponseJson(String picName, MultipartFile uploadFile, HttpServletRequest request) throws Exception {
        //定义文件名
        String fileName = "";
        //1.获取原始文件名
        String uploadFileName = uploadFile.getOriginalFilename();
        //2.截取文件扩展名
        String extendName = uploadFileName.substring(uploadFileName.lastIndexOf(".") + 1, uploadFileName.length());
        //3.把文件加上随机数，防止文件重复
        String uuid = UUID.randomUUID().toString().replace("-", "").toUpperCase();
        //4.判断是否输入了文件名
        if (!StringUtils.isEmpty(picName)){
            fileName = uuid + "_" + picName + "." + extendName;
        } else {
            fileName = uuid + "_" + uploadFileName;
        }
        System.out.println(fileName);

        //2.获取文件路径
        ServletContext context = request.getServletContext();
        String basePath = context.getRealPath("/static/uploads");
        //3.解决同一文件夹中文件过多问题
        String datePath = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
        //4.判断路径是否存在
        File file = new File(basePath + File.separator + datePath +  fileName);
        file = new File(file, fileName);
        if (!file.getParentFile().exists()) {
            file.getParentFile().mkdirs();
        }
        //5.使用MulitpartFile接口中的方法，把上传的文件写到指定位置
        uploadFile.transferTo(file);
        return "success";
    }
}
