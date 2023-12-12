package com.example.courseservice.repository;

import com.example.courseservice.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CourseRepo extends JpaRepository<Course,Integer> {
    /*@Query(value = "SELECT * FROM COURSES WHERE id=:id", nativeQuery = true)
     List<Course> findUserItems(List<Integer> userItems);
*/
    List<Course> findAllByIdIn(List<Integer> userItems);
}
