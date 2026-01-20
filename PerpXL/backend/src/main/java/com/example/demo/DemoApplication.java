package com.example.demo;

import com.example.audiostream.config.WebSocketConfig;
import com.example.audiostream.handler.AudioStreamHandler;
import com.example.audiostream.service.GeminiService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
// This line manually forces the app to load your files:
@Import({WebSocketConfig.class, AudioStreamHandler.class, GeminiService.class}) 
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
}