/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlstudentjpa;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author USER
 */
public class Select {
    public static void Select(){
        try{
                EntityManagerFactory emf = Persistence.createEntityManagerFactory("QLStudentJPAPU");
                EntityManager em = emf.createEntityManager();
                em.getTransaction().begin();
                List<Student> list = em.createNamedQuery("Student.findAll",Student.class).getResultList();
                for (int i = 0; i < list.size(); i++) {
                    list.get(i).toString();
                }
                em.getTransaction().commit();
                em.close();
        }catch(Exception e){
            System.out.println("Loi : "+e);
        }
    }
}
