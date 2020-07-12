package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Instructor;
import com.luv2code.hibernate.demo.entity.InstructorDetail;
import com.luv2code.hibernate.demo.entity.Student;

public class DeleteDemo {

	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration()
									.configure("hibernate.cfg.xml")
									.addAnnotatedClass(Instructor.class)
									.addAnnotatedClass(InstructorDetail.class)
									.buildSessionFactory();
		Session session = factory.getCurrentSession();
		
		try {
			
			
			
			session.beginTransaction();
			
			Instructor myInstructor = session.get(Instructor.class, 1);
			
			if(myInstructor!=null) {
				System.out.println(myInstructor);
				session.delete(myInstructor);
			}
			
			session.getTransaction().commit();
			System.out.println("Done!");
			
		}
		finally {
			System.out.println("Closing Factory");
			factory.close();
		}
	}

}
