package com.studybuddy.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.studybuddy.Entities.Course;
import com.studybuddy.Services.CourseService;

@RestController
@RequestMapping("/courses")
@CrossOrigin(origins = "http://localhost:5173")
public class CourseController {

    @Autowired
    private CourseService courseService;

    @PostMapping("/create")
    public Course createCourse(@RequestBody Course course){
        return courseService.createCourse(course);
    }

    @GetMapping("/all")
    public List<Course> getCourses(){
        return courseService.getAllCourses();
    }

    @GetMapping("/{id}")
    public Course getCourse(@PathVariable Long id){
        return courseService.getCourseById(id);
    }

    @PutMapping("/update/{id}")
    public Course updateCourse(@PathVariable Long id,
                               @RequestBody Course course){

        return courseService.updateCourse(id, course);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteCourse(@PathVariable Long id){

        return courseService.deleteCourse(id);
    }
}