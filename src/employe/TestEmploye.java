/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employe;

/**
 *
 * @author Abdelkalek
 */
public class TestEmploye {
      public static void main(String[] args) {
          Employer30 em = new Employer30();
           Employer30 em1 = new Employer30("Abdelkalek",50.0,20,50);
         
      em1.affichier(); 
      System.out.println(em1.getSalaire());
 Employer50 emp1 = new Employer50(); 
           Employer50 emp = new Employer50("Abdelkalek",50.0,20,50);
         System.out.println(emp.getSalaire());
          Commercieaux com = new Commercieaux(); 
          Commercieaux com1 = new Commercieaux("Abdelkalek",50.0,20,50);
         System.out.println(com1.getSalaire());
    }
}
