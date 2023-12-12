package com.example.courseservice.service;

import com.example.courseservice.entity.Course;
import com.example.courseservice.repository.CourseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {
    public CourseService(CourseRepo courseRepo) {
        this.courseRepo = courseRepo;
    }

    @Autowired
    CourseRepo courseRepo;
    public Course addCourse(Course course){
        return courseRepo.save(course);
    }
    public Course getCourse(Integer id){
        return courseRepo.findById(id).orElse(null);
    }
    public List<Course> getAllCourses(){
        return courseRepo.findAll();
    }
    public List<Course> getUserItems(List<Integer> userItems){
        return courseRepo.findAllByIdIn(userItems);
    }
}
