package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Student;

public class ReadStudentDemo {

	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration()
									.configure("hibernate.cfg.xml")
									.addAnnotatedClass(Student.class)
									.buildSessionFactory();
		Session session = factory.getCurrentSession();
		
		try {
			
			System.out.println("Creating new Student object");
			Student tempStudent = new Student("Daffy","duck", "DD@gmail.com");
			
			session.beginTransaction();
			
			System.out.println("Saving the Student");
			System.out.println(tempStudent);
			session.save(tempStudent);
			
			session.getTransaction().commit();
			
			
			System.out.println("Saving Student : Generated Id" + tempStudent.getId());
			
			session = factory.getCurrentSession();
			session.beginTransaction();
			System.out.println("\nGetting Student with Id : "+ tempStudent.getId());
			Student myStudent = session.get(Student.class, tempStudent.getId());
			System.out.println("Get Complete " + myStudent);
			session.getTransaction().commit();
		
			
			System.out.println("Done!");
			
		}
		finally {
			System.out.println("Closing Factory");
			factory.close();
		}
	}

}
