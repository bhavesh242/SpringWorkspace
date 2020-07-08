package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Student;

public class PrimaryKeyDemo {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class)
				.buildSessionFactory();
		Session session = factory.getCurrentSession();

		try {

			System.out.println("Creating new Student object");
			Student tempStudent1 = new Student("Paul", "Wall", "paulwall@gmail.com");
			
			System.out.println("Creating new Student object");
			Student tempStudent2 = new Student("Steve", "jobs", "sj@gmail.com");

			System.out.println("Creating new Student object");
			Student tempStudent3 = new Student("Smith", "Smith", "ss@gmail.com");

			session.beginTransaction();

			System.out.println("Saving the Student");

			session.save(tempStudent1);
			session.save(tempStudent2);
			session.save(tempStudent3);

			session.getTransaction().commit();

			System.out.println("Done!");

		} finally {
			System.out.println("Closing Factory");
			factory.close();
		}
	}

}
