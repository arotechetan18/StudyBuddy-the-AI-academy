package com.studybuddy.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.studybuddy.Entities.Lesson;

public interface LessonRepository extends JpaRepository<Lesson, Long> {

    List<Lesson> findByModuleId(Long moduleId);
}