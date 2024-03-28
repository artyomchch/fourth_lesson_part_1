package org.example.dbJPA;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.example.DAO.cource.Course;
import org.example.DAO.cource.CourseService;
import org.example.DAO.teacher.Teachers;
import org.example.DAO.teacher.TeachersService;

import java.util.List;

public class App 
{
    public static void main( String[] args )
    {
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		CourseService courseDao = context.getBean("springJpaCourseService", CourseService.class);
		TeachersService teachersService = context.getBean("springJpaTeachersService", TeachersService.class);

		for(Teachers t : teachersService.findAll())
			System.out.println(t);

		System.out.println(teachersService.findAddrById(1));

		/*Course spring = new Course();
		spring.setTitle("Spring");
		spring.setLength(40);
		spring.setDescription("Spring framework");
		courseDao.getCourseRepository().save(spring);*/
		
		// courseDao.getCourseRepository().delete(8);
		
		
//		for(Course c : courseDao.findAll())
//			System.out.println(c);




		List<Course> c = courseDao.findByLength(20);
		System.out.println(c.get(0));
		context.close();
    }
}
