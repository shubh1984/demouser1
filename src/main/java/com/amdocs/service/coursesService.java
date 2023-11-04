package com.amdocs.service;

import java.util.List;

import com.amdocs.Entities.Course;

public interface coursesService {
	public List<Course> getcourse();
	public Course getCourse(long courseId);
	
	public Course add(Course course);
	
	public Course updateCourse(Course course);
	
	public void deleteCourse(long parseLong);
	

}
