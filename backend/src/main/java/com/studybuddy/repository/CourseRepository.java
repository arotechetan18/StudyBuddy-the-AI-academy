package com.studybuddy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.studybuddy.Entities.Course;

public interface CourseRepository extends JpaRepository<Course, Long>{

}