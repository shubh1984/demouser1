package com.amdocs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amdocs.Entities.Course;
import com.amdocs.jpaRepo.Coursejpa;
@Service
public class courseServiceIMPL implements coursesService {
	@Autowired
	private Coursejpa courseDao;
	@Override
	public List<Course> getcourse() {
		return courseDao.findAll();
	}
	
	@Override
	public Course getCourse(long courseId) {
		return courseDao.findById(courseId).get();
	}
	
	@Override
	public Course updateCourse(Course course) {
		courseDao.save(course);
		return course;
	}
	
	@Override
	public Course add(Course course) {
		courseDao.save(course);
		return course;
	}
	
	@Override
	public void deleteCourse(long parseLong) {
		Course entity = courseDao.getOne(parseLong);
		courseDao.delete(entity);
	}
}
	
	
	
	


