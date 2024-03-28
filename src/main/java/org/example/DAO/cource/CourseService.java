package org.example.DAO.cource;

import java.util.List;

public interface CourseService {
	CourseRepository getCourseRepository();
	List<Course> findAll();

	List<Course> findByLength(int i);

	
	/*void insert(Course course);
	Course findById(int id);
	List<Course> findByTitle(String title);
	void update(Course course);
	void delete(int id);*/ 
}
