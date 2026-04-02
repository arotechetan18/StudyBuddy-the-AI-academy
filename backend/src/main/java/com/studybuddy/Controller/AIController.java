package com.studybuddy.Controller;

import java.util.Map;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ai")
@CrossOrigin(origins = "http://localhost:5173")
public class AIController {

    @PostMapping("/explain")
    public String explainLesson(@RequestBody Map<String, String> request) {

        String lessonContent = request.get("content");

        // Temporary AI response (later OpenAI integrate)
        return "AI Explanation: " + lessonContent;
    }
}
