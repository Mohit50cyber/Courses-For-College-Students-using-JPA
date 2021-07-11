package com.springrest.springrest.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springrest.springrest.Entities.Course;

@Service
public class CourseServiceImpl implements CourseService {

	List<Course> list;
	
	public CourseServiceImpl() {
		
		list=new ArrayList<>();
		list.add(new Course(23,"dsvjn","hbshj"));
		list.add(new Course(2653,"dsgnvgvjn","hbshj"));
		list.add(new Course(2563,"dshghgvjn","hhggfhgbshj"));
		list.add(new Course(223,"ds21vjn","hbshfchfchj"));
		list.add(new Course(2223,"dsv vvjn","hbhfcfhcshj"));
		list.add(new Course(2463,"dsghchgcgvghvjn","hbhfchfshj"));
		
	}
	public List<Course> getCourses()
	{
		return list;
	}
	@Override
	public Course getCourse(long courseId) {
		Course c=null;
		for(Course course:list)
		{
			if(course.getId()==courseId)
			{
				c=course;
				break;
			}
		}
		return c;
	}
	@Override
	public Course addCourse(Course course) {
		list.add(course);
		return course;
	}
	
	
	
}
