package org.example.DAO.cource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service("springJpaCourseService")
@Repository
@Transactional
public class SpringJpaCourseService implements CourseService {
	private static final Log LOG = LogFactory.getLog(SpringJpaCourseService.class);
	
	@Autowired
	private CourseRepository courseRepository;
	
	public CourseRepository getCourseRepository() {
		return courseRepository;
	}



	@Transactional(readOnly=true) 
	public List<Course> findAll() {
		return new ArrayList<Course>(courseRepository.findAll());
	}

	@Transactional(readOnly=true)
	public List<Course> findByLength(int i) {
		return new ArrayList<Course>(courseRepository.findByLength(i));
	}



}