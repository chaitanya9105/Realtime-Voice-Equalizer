Audio Streamer & Visualizer
Developer: [Your Name]

Role: Backend Developer Intern (Assignment)

Date: January 2026

📌 Project Overview
This project is a full-stack real-time audio processing application built for the Bluestock Fintech pre-interview assignment. It demonstrates:

Frontend: A custom circular audio equalizer using the Web Audio API and HTML5 Canvas.

Backend: A low-latency streaming service using Spring Boot and WebSockets.

Data Flow: Bi-directional streaming where audio chunks are sent to the server, and transcription responses are streamed back to the client in real-time.

🚀 Features
Real-Time Visualization: Smooth 60 FPS circular frequency visualizer reacting to microphone input.

WebSocket Streaming: Continuous, low-latency audio data transfer between client and server.

Scalable Architecture: Spring Boot backend designed to handle binary audio streams (prepared for Gemini API integration).

Reactive UI: Instant feedback loop with connection status indicators (Red/Green).

🛠️ Tech Stack
Frontend:

HTML5, CSS3, JavaScript (Vanilla)

Web Audio API (AnalyserNode, ScriptProcessor)

Canvas API (Visual rendering)

Backend:

Java 17+

Spring Boot 3.x

Spring WebSocket

Maven

📂 Project Structure
Bash

Bluestock-Assignment/
├── backend/                # Spring Boot Server
│   ├── src/main/java/...   # Java Source Code (Handlers, Services, Config)
│   ├── mvnw & mvnw.cmd     # Maven Wrapper
│   └── pom.xml             # Dependencies
│
└── frontend/               # Client-Side Application
    └── index.html          # Single-file solution (Visualizer + Logic)
⚡ How to Run Locally
Prerequisites
Java JDK 17 or higher installed.

A modern web browser (Chrome/Edge recommended).

Note: Maven is included in the project via wrapper (mvnw).

Step 1: Start the Backend Server
Open your terminal.

Navigate to the backend directory:

Bash

cd backend
Run the application:

Bash

# Windows (Command Prompt)
mvnw spring-boot:run

# Mac/Linux (Terminal)
./mvnw spring-boot:run
Wait until you see: Started DemoApplication in ... seconds.

Step 2: Launch the Frontend
Navigate to the frontend folder.

Open index.html in your browser.

Recommended: Use a local server (e.g., VS Code "Live Server" extension) to avoid browser security restrictions on microphone access.

Alternative: Double-click index.html (might require allowing permissions explicitly).

Step 3: Test the Stream
Click the blue "Start Visualizer & Stream" button.

Allow Microphone access when prompted.

Speak into the microphone.

Visual: You will see the circular bars reacting to your voice.

Status: The text at the bottom should turn Green ("Connected to Server").

Logs: The backend terminal will show Client connected.
