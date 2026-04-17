package com.studybuddy.Services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.studybuddy.Entities.Module;
import com.studybuddy.repository.ModuleRepository;

@Service
public class ModuleService {

    @Autowired
    private ModuleRepository repo;

    public List<Module> getModulesByCourse(Long courseId) {
        return repo.findByCourseId(courseId);
    }
}