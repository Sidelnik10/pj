package com.example.demo.controller;

import com.example.demo.dto.CustomSuccessResponse;
import com.example.demo.serivce.ReportServiceImpl;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ReportController {

    private ReportServiceImpl reportService;

    @PostMapping("/filling")
    public ResponseEntity<CustomSuccessResponse> download() {
        reportService.generateDataBase(); // realisations
        return CustomSuccessResponse.ok();
    }

}
