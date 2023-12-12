package com.example.courseservice.controller;

import com.example.courseservice.entity.Course;
import com.example.courseservice.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/course")
public class CourseController {
    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }

    @GetMapping("/test")
    public String testAPI(){
        return "OK";
    }

    @Autowired
    CourseService courseService;

    @PostMapping("/addcourse")
    void addCourse(@RequestBody Course course) {
        courseService.addCourse(course);
    }

    @GetMapping("/getcourse/{id}")
    Course getCourse(@PathVariable Integer id) {
        return courseService.getCourse(id);
    }
    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/getcourses")
    List<Course> getCourses(){
        return courseService.getAllCourses();
    }
//    @CrossOrigin(origins = "http://localhost:3000")

    @PostMapping("/getUserItems")
    List<Course> getUserItems(@RequestBody List<Integer> userItems)
    {
        return courseService.getUserItems(userItems);
    }

}
