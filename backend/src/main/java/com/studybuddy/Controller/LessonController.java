package com.studybuddy.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.studybuddy.Entities.Lesson;
import com.studybuddy.Services.LessonService;

@RestController
@RequestMapping("/lessons")
@CrossOrigin(origins = "http://localhost:5173")
public class LessonController {

    @Autowired
    private LessonService lessonService;

    @GetMapping("/{moduleId}")
    public List<Lesson> getLessons(@PathVariable Long moduleId) {
        return lessonService.getLessonsByModule(moduleId);
    }
}