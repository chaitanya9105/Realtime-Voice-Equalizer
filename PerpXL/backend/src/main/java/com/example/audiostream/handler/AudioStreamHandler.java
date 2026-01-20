package com.example.audiostream.handler;

import com.example.audiostream.service.GeminiService; // <--- This was likely missing!
import org.springframework.web.socket.BinaryMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.BinaryWebSocketHandler;
import org.springframework.stereotype.Component;

@Component
public class AudioStreamHandler extends BinaryWebSocketHandler {

    private final GeminiService geminiService;

    public AudioStreamHandler(GeminiService geminiService) {
        this.geminiService = geminiService;
    }

    @Override
    public void afterConnectionEstablished(WebSocketSession session) {
        System.out.println("Client connected: " + session.getId());
        geminiService.startStream(session);
    }

    @Override
    protected void handleBinaryMessage(WebSocketSession session, BinaryMessage message) {
        byte[] audioData = message.getPayload().array();
        geminiService.sendAudio(session, audioData);
    }
}