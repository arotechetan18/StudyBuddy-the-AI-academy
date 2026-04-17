package com.studybuddy.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.studybuddy.Entities.Module;
import com.studybuddy.Services.ModuleService;

@RestController
@RequestMapping("/modules")
@CrossOrigin(origins = "http://localhost:5173")
public class ModuleController {

    @Autowired
    private ModuleService moduleService;

    @GetMapping("/{courseId}")
    public List<Module> getModules(@PathVariable Long courseId) {
        return moduleService.getModulesByCourse(courseId);
    }
}