package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Instructor;
import com.luv2code.hibernate.demo.entity.InstructorDetail;
import com.luv2code.hibernate.demo.entity.Student;

public class CreateDemo {

	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration()
									.configure("hibernate.cfg.xml")
									.addAnnotatedClass(Instructor.class)
									.addAnnotatedClass(InstructorDetail.class)
									.buildSessionFactory();
		Session session = factory.getCurrentSession();
		
		try {
			
			
			
			/*Instructor tempInstructor = new Instructor("Bhavesh", "Agrawal", "bhavesh@gmail.com");
			InstructorDetail tempInstructorDetail = new InstructorDetail(
					"http://www.bhavesh.com/youtube","Bhavesh Coder");
			
			tempInstructor.setInstructorDetail(tempInstructorDetail);
			session.beginTransaction();
			*/
			Instructor tempInstructor = new Instructor("Steve", "Menezes", "svm@gmail.com");
			InstructorDetail tempInstructorDetail = new InstructorDetail(
					"http://www.guitarHero.com/youtube","Guitar Hero");
			
			tempInstructor.setInstructorDetail(tempInstructorDetail);
			session.beginTransaction();
			
			System.out.println("Saving Instructor " + tempInstructor);
			session.save(tempInstructor);
			
			session.getTransaction().commit();
			
			System.out.println("Done!");
			
		}
		finally {
			System.out.println("Closing Factory");
			factory.close();
		}
	}

}
