package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Student;

public class UpdateStudentDemo {

	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration()
									.configure("hibernate.cfg.xml")
									.addAnnotatedClass(Student.class)
									.buildSessionFactory();
		
		try {
			
			int studentId = 1;
			Session session = factory.getCurrentSession();
			session.beginTransaction();
			
			Student myStudent = session.get(Student.class, studentId);
			System.out.println(myStudent);
			System.out.println("Updating Student ..");
			myStudent.setFirstName("Scooby");
			session.getTransaction().commit();
			
			session = factory.getCurrentSession();
			session.beginTransaction();
			
			System.out.println("Update Email for all Students");
			
			session.createQuery("update Student set email = 'foo@gmail.com'").executeUpdate();
			session.getTransaction().commit();
			System.out.println("Done!");
			
		}
		finally {
			System.out.println("Closing Factory");
			factory.close();
		}
	}

}
