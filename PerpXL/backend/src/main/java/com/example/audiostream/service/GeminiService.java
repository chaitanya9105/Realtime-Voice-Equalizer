package com.example.audiostream.service;

import org.springframework.stereotype.Service;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import java.io.IOException;

@Service
public class GeminiService {

    public void startStream(WebSocketSession clientSession) {
        // In a real app, this is where we'd connect to Google API
        System.out.println("Gemini Stream Started for session: " + clientSession.getId());
    }

    public void sendAudio(WebSocketSession clientSession, byte[] audioData) {
        // MOCK RESPONSE: Simulate "thinking" and sending text back
        // In the real version, we'd send audioData to Google here
        
        String mockTranscription = "I hear you! (Audio chunk received: " + audioData.length + " bytes)";
        
        try {
            if(clientSession.isOpen()) {
                 clientSession.sendMessage(new TextMessage(mockTranscription));
            }
        } catch (IOException e) { 
            e.printStackTrace(); 
        }
    }
}