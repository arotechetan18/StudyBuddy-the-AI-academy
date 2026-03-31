package com.studybuddy.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.studybuddy.Entities.Course;
import com.studybuddy.repository.CourseRepository;

@Service
public class CourseService {

    @Autowired
    private CourseRepository courseRepository;

    public Course createCourse(Course course){
        return courseRepository.save(course);
    }

    public List<Course> getAllCourses(){
        return courseRepository.findAll();
    }

    public Course getCourseById(Long id){
        return courseRepository.findById(id).orElse(null);
    }

    public Course updateCourse(Long id, Course updatedCourse){

        Course course = courseRepository.findById(id).orElseThrow();

        course.setTitle(updatedCourse.getTitle());
        course.setDescription(updatedCourse.getDescription());
        course.setPrice(updatedCourse.getPrice());
        course.setLevel(updatedCourse.getLevel());

        return courseRepository.save(course);
    }

    public String deleteCourse(Long id){
        courseRepository.deleteById(id);
        return "Course Deleted";
    }
}