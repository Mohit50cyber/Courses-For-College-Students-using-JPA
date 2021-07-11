package com.springrest.springrest.service;

import java.util.List;

import com.springrest.springrest.Entities.Course;

public interface CourseService {

	public List<Course> getCourses();
	
	public Course getCourse(long courseId);
	
	public Course addCourse(Course course);
}
