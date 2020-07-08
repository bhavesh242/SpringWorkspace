package com.luv2code.hibernate.demo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Student;

public class QueryStudentDemo {

	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration()
									.configure("hibernate.cfg.xml")
									.addAnnotatedClass(Student.class)
									.buildSessionFactory();
		Session session = factory.getCurrentSession();
		
		try {
			
			System.out.println("Creating new Student object");
			Student tempStudent = new Student("Paul","Wall", "paulwall@gmail.com");
			
			session.beginTransaction();
			
			// query students
			List<Student> theStudents = session.createQuery("from Student s where s.firstName='Daffy'").list();
			for(Student student : theStudents) {
				System.out.println(student);
			}
			//display students
			
			session.getTransaction().commit();
			
			System.out.println("Done!");
			
		}
		finally {
			System.out.println("Closing Factory");
			factory.close();
		}
	}

}
