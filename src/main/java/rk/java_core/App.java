package rk.java_core;

import java.util.List;
import java.util.Properties;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import rk.java_core.entity.Student;

public class App {
	public static void main(String[] args) {
		System.out.println(" JAVA CORE ");

		Properties p = new Properties();
		System.out.println(p.getProperty("user"));

//		Student Entity
		Student student = new Student();
		student.setSid(102);
		student.setSname("ranjit");

//        jpa demo
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPADemo");
		EntityManager em = emf.createEntityManager();

		// To save
		em.getTransaction().begin();
		em.persist(student);
		em.getTransaction().commit();
		System.out.println(student);

		// To save end

		// To get
		Student s = em.find(Student.class, 111);
		System.out.println(s);
		// To get end

	}
}
