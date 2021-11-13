package maven_project.mavenhibernateproj;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import maven_project.mavenhibernateproj.entity.Instructor;
import maven_project.mavenhibernateproj.entity.InstructorDetail;

public class DeleteDemo {
	
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
			
			session.beginTransaction();
			//get the Student by key
			
			int theId = 1;
			
			Instructor tempInstructor = session.get(Instructor.class,theId);
			
			System.out.println("Found Instructor : " + tempInstructor);
			
			//delete instructor
			
			if(tempInstructor!=null){
				System.out.println("Deleting: "+ tempInstructor);
				
				//Note it will also delete associated "details" objects because of casacade type all
				
				session.delete(tempInstructor);
			}
			
			System.out.println("Deleting the instructor and assocaited detail object");
			
			
			//commit transaction
			session.getTransaction().commit();
			System.out.println("deleting done congrats");		
			
		}
		
		catch(Exception e){
			factory.close();
		}

	}


}
