package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Instructor;
import com.luv2code.hibernate.demo.entity.InstructorDetail;
import com.luv2code.hibernate.demo.entity.Student;

public class GetInstructortDetailDemo {

	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration()
									.configure("hibernate.cfg.xml")
									.addAnnotatedClass(Instructor.class)
									.addAnnotatedClass(InstructorDetail.class)
									.buildSessionFactory();
		Session session = factory.getCurrentSession();
		
		try {
			
			
			
			session.beginTransaction();
			
			int id = 2;
			InstructorDetail tempINInstructorDetail = 
					session.get(InstructorDetail.class, id);
			
			System.out.println(tempINInstructorDetail);
			System.out.println();
			
			session.getTransaction().commit();
			System.out.println("Done!");
			
		}
		catch(Exception exc) {
			exc.printStackTrace();
		}
		finally {
			System.out.println("Closing Factory");
			session.close();
			factory.close();
		}
	}

}
