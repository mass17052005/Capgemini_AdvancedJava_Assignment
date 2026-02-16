package com.capgemini.hibernate.Hybernate_ManytoMany;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class App {
    public static void main(String[] args) {

        EntityManagerFactory emf =
                Persistence.createEntityManagerFactory("myPersistenceUnit");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        // Create Department
        Department dept = new Department();
        dept.setName("Computer Science");

        em.persist(dept);

        // Create Students
        Student s1 = new Student();
        s1.setName("Aditya");
        s1.setDepartment(dept);

        Student s2 = new Student();
        s2.setName("Rahul");
        s2.setDepartment(dept);

        em.persist(s1);
        em.persist(s2);

        em.getTransaction().commit();

        em.close();
        emf.close();

        System.out.println("Data inserted successfully!");
    }
}
