package com.studybuddy.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.studybuddy.Entities.Lesson;
import com.studybuddy.repository.LessonRepository;

import java.util.List;

@Service
public class LessonService {

    @Autowired
    private LessonRepository lessonRepository;

    public Lesson createLesson(Lesson lesson){

        return lessonRepository.save(lesson);

    }

    public List<Lesson> getLessonsByCourse(Long courseId){

        return lessonRepository.findByCourseId(courseId);

    }

}