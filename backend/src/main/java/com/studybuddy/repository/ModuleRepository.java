package com.studybuddy.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.studybuddy.Entities.Module;

public interface ModuleRepository extends JpaRepository<Module, Long> {

    List<Module> findByCourseId(Long courseId);
}