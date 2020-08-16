/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlstudentjpa;

import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author USER
 */
public class Insert {
    public static void Insert(){
    try{
                Scanner sc = new Scanner(System.in);
                EntityManagerFactory emf = Persistence.createEntityManagerFactory("QLStudentJPAPU");
                EntityManager em = emf.createEntityManager();
                em.getTransaction().begin();
                Student student = new Student();
                System.out.println("Nhap vao ma : ");
                int a = Integer.parseInt(sc.nextLine());
                student.setMasv(a);
                System.out.println("Nhap vao ten : ");
                String b = sc.nextLine();
                student.setName(b);
                System.out.println("Nhap vao tuoi : ");
                int c = Integer.parseInt(sc.nextLine());
                student.setOld(c);
                System.out.println("Nhap vao lop : ");
                String d = sc.nextLine();
                student.setClass1(d);
                em.persist(student);
                em.getTransaction().commit();
                em.close();
    }catch(Exception e){
        System.out.println("Loi : "+e);
    }
    }
    
}
