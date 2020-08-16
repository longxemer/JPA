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

public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int chon;
       do{
           menu();
           chon = Integer.parseInt(sc.nextLine());
           switch(chon){
               case 1:
                   Select.Select();
                   break;
               case 2:
                   Insert.Insert();
                   break;
               case 3:
                   Update.Update();
                   break;
               case 4:
                   Delete.Delete();
                   break;
               case 5:
                   break;
               default:
                   break;
                   
           }
       }while(chon!=5);
    }
static void menu(){
    System.out.println("     1. Xem du lieu");
    System.out.println("     2. Them du lieu");
    System.out.println("     3. Sua du lieu");
    System.out.println("     4. Xoa du lieu");
    System.out.println("     5. Thoat");
    System.out.println("   Choose: ");
}
   
    
}
