package com.amdocs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.amdocs.Entities.Course;
import com.amdocs.service.coursesService;

@RestController
public class MyController {
	@Autowired
	private coursesService cs;
	@GetMapping("/home")
	public String home() {
		return "welcome to course application";
	}
	@GetMapping("/courses")
	public List<Course>getcourse(){
		return this.cs.getcourse();
	}
	@GetMapping("/courses/{courseId}")
	public Course getCourse (@PathVariable String courseId){
		return this.cs.getCourse(Long.parseLong(courseId));
	}
	@PostMapping("/courses")
		public Course addCourse (@RequestBody Course course) {
			return this.cs.updateCourse(course);
		}
	
  @PutMapping("/courses")
  public Course updateCourse(@RequestBody Course course) {
	return this.cs.updateCourse(course);
  }
  @DeleteMapping("/courses/{courseId}")
   public ResponseEntity<HttpStatus> deleteCourse
    (@PathVariable String courseId){
	try {
		this.cs.deleteCourse(Long.parseLong(courseId));
		return new ResponseEntity<>(HttpStatus.OK);
		
	}catch(Exception e) {
		return new ResponseEntity<>
		(HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
	

}
