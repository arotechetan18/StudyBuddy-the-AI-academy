package com.studybuddy.Services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.studybuddy.Entities.Lesson;
import com.studybuddy.repository.LessonRepository;

@Service
public class LessonService {

    @Autowired
    private LessonRepository repo;

    public List<Lesson> getLessonsByModule(Long moduleId) {
        return repo.findByModuleId(moduleId);
    }
    public Lesson getLessonById(Long id) {
    return repo.findById(id).orElseThrow();
}
}