package maven_project.mavenhibernateproj;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import maven_project.mavenhibernateproj.entity.Course;
import maven_project.mavenhibernateproj.entity.Instructor;
import maven_project.mavenhibernateproj.entity.InstructorDetail;

public class CreateInstructorDemo {
	
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
			
			//create a student object
			
			System.out.println("Creating new Student");
			
			Instructor tempInstructor = new Instructor("Abdev","ccc","dev@a.com");
			
			InstructorDetail testDetail = new InstructorDetail("dev.com","code, games");
			
			tempInstructor.setInstructorDetailId(testDetail);
			
			//start a transaction
			session.beginTransaction();
			//save the student object
			
			System.out.println("Saving the Student object");
			
			session.save(tempInstructor);
			
			//commit transaction
			session.getTransaction().commit();
			System.out.println("Saving done congrats");		
			
		}
		
		catch(Exception e){
			session.close();
			factory.close();
		}

	}


}
