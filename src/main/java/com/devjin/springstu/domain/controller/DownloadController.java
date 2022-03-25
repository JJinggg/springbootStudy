package com.devjin.springstu.domain.controller;

import com.devjin.springstu.domain.service.DownloadService;
import org.springframework.web.bind.annotation.*;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@RestController
@RequestMapping("/download")
public class DownloadController {
    private final DownloadService downloadService;
    public DownloadController(DownloadService _downloadService)
    {
        this.downloadService = _downloadService;
    }

    @GetMapping
    public void downloadfile (HttpServletResponse response)throws IOException
    {
        downloadService.downloadFile(response);
    }

}
