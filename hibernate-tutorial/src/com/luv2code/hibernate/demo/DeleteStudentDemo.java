package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Student;

public class DeleteStudentDemo {

	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration()
									.configure("hibernate.cfg.xml")
									.addAnnotatedClass(Student.class)
									.buildSessionFactory();
		
		try {
			
			int studentId = 1;
			Session session = factory.getCurrentSession();
			session.beginTransaction();
			//Student myStudent = session.get(Student.class, studentId);
			//session.delete(myStudent);
			session.createQuery("delete from Student where id=2").executeUpdate();
			session.getTransaction().commit();
			
			//System.out.println(myStudent);
			System.out.println("Done!");
			
		}
		finally {
			System.out.println("Closing Factory");
			factory.close();
		}
	}

}
