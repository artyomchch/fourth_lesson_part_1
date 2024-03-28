package org.example.DAO.cource;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CourseRepository extends CrudRepository<Course, Integer> {
	List<Course> findAll();

	List<Course> findByLength(int length);

	@Query("SELECT c FROM Course c WHERE c.length <= :mLength")
	List<Course> findShortCourses(@Param("mLength") int maxLength);


}
