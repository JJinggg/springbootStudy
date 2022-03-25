package com.devjin.springstu.domain.service;

import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Service;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.net.URLEncoder;
@Service
public class DownloadService {

    public DownloadService()
    {}

    public void downloadFile(HttpServletResponse response) throws IOException
    {
        String path = "/Users/kimjinyoung/TestFolder/version.txt";
        byte[] fileByte = FileUtils.readFileToByteArray(new File(path));
        response.setContentType("application/octet-stream");
        response.setHeader("Content-Disposition", "attachment; fileName=\"" + URLEncoder.encode("version.txt", "UTF-8")+"\";");
        response.setHeader("Content-Transfer-Encoding", "binary");
        response.getOutputStream().write(fileByte);
        response.getOutputStream().flush();
        response.getOutputStream().close();
    }






}
