package com.capgemini.hibernate.ManyToMany;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class App {

    public static void main(String[] args) {

        EntityManagerFactory emf =
                Persistence.createEntityManagerFactory("myPersistenceUnit");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        // Create Projects
        Project p1 = new Project("Tracking System");
        Project p2 = new Project("Insurance System");
        
        Set<Project> project = new HashSet<>();
        project.add(p1);
        project.add(p2);

        // Create Employees
        Employee e1 = new Employee("Aditya",project);
        Employee e2 = new Employee("Rahul",project);

        Set<Employee> emp=new HashSet<>();
        emp.add(e1);
        emp.add(e2);
        // Persist OWNER side (Employee)
        
        p1.setEmployees(emp);
        p2.setEmployees(emp);
        
        em.persist(e1);
        em.persist(e2);

        em.getTransaction().commit();

        em.close();
        emf.close();

        System.out.println("Many-to-Many Mapping Saved Successfully!");
    } 
}
