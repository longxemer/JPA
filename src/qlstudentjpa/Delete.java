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
public class Delete {
    public static void Delete(){
         try{
                Scanner sc = new Scanner(System.in);
                EntityManagerFactory emf = Persistence.createEntityManagerFactory("QLStudentJPAPU");
                EntityManager em = emf.createEntityManager();
                em.getTransaction().begin();
                System.out.println("Nhap vao ma : ");
                int a = Integer.parseInt(sc.nextLine());
                Student s = em.find(Student.class,a);
                em.remove(s);
                em.getTransaction().commit();
                System.out.println("Thanh Cong !");
                em.close();
                emf.close();
         }catch(Exception e){
             System.out.println("Loi : "+e);
         }
    }
}
