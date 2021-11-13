package maven_project.mavenhibernateproj;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import maven_project.mavenhibernateproj.entity.Instructor;
import maven_project.mavenhibernateproj.entity.InstructorDetail;

public class CreateDemo {
	
	public static void main(String[] args)  {
		// TODO Auto-generated method stub

		// Create session factory
		

		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(InstructorDetail.class)
				.buildSessionFactory();

		// Create session
		Session session = factory.getCurrentSession();
		/*Class.forName("com.mysql.cj.jdbc.Driver").newInstance();*/
		
		try{
			
			//create a student object
			
			System.out.println("Creating new Student");
			
			Instructor tempInstructor = new Instructor("kamal","ccc","kamal@a.com");
			
			InstructorDetail testDetail = new InstructorDetail("youtube.com","try2code");
			
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
			factory.close();
		}

	}


}
