package com.example.lab7.controller;

import com.example.lab7.service.RequestCounter;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/counter")
public class RequestCounterController {

    @GetMapping
    public ResponseEntity<Long> getRequestCount() {
        return ResponseEntity.ok(RequestCounter.getRequestCount());
    }
}