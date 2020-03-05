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
public  class Employer30 extends Employe {
 public  Employer30() {
    }
    Employer30(String a, double tarif, int nbrheurs, int nbrheurSuppl) {
      super(nbrheurs,tarif,nbrheurSuppl,a);
    }

    @Override
    public double getSalaire() {
        
       
        return this.nbrhtravaille *tarif + tarif*nbrheurSuppl*(1+30.0/100.0);
    }
    public void affichier()
    {
          System.out.println("le tarif   "+this.tarif);
            System.out.println("le nbr h de travaille  "+this.nbrhtravaille); 
            System.out.println("le nbr h supplimentaire   "+this.nbrheurSuppl); 
    }
    
}
