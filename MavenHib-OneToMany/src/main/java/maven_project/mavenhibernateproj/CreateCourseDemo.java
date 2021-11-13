package maven_project.mavenhibernateproj;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import maven_project.mavenhibernateproj.entity.Course;
import maven_project.mavenhibernateproj.entity.Instructor;
import maven_project.mavenhibernateproj.entity.InstructorDetail;

public class CreateCourseDemo {
	
	public static void main(String[] args)  {
		// TODO Auto-generated method stub

		// Create session factory
		

		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(InstructorDetail.class)
				.addAnnotatedClass(Course.class)
				.buildSessionFactory();

		// Create session
		Session session = factory.getCurrentSession();
		/*Class.forName("com.mysql.cj.jdbc.Driver").newInstance();*/
		
		try{
			
			session.beginTransaction();
			int theId = 1;
			
			Instructor tempInstructor = session.get(Instructor.class,theId);
			
			Course course1 = new Course("Python");
			
			//Course course2 = new Course("Spring");
			//List<Course> courses = new ArrayList<Course>();
			
			//stempInstructor.add(course2);
			
			tempInstructor.add(course1);
		
			//instructor.setCourses(courses);
			//session.save(course2);
			
			session.save(course1);
			
			//commit transaction
			session.getTransaction().commit();
			System.out.println("Saving done congrats");		
			
		}
		
		catch(Exception e){
			//session.close();
			factory.close();
		}

	}


}
