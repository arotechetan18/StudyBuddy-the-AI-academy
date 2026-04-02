package com.studybuddy.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.studybuddy.Entities.Lesson;
import com.studybuddy.Services.LessonService;

import java.util.List;

@RestController
@RequestMapping("/lessons")
@CrossOrigin(origins = "http://localhost:5173")
public class LessonController {

    @Autowired
    private LessonService lessonService;

    @PostMapping("/create")
    public Lesson createLesson(@RequestBody Lesson lesson){

        return lessonService.createLesson(lesson);

    }

    @GetMapping("/course/{courseId}")
    public List<Lesson> getLessons(@PathVariable Long courseId){

        return lessonService.getLessonsByCourse(courseId);

    }

}