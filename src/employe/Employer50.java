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
public class Employer50 extends Employe {
   Employer50(){}
    Employer50(String a, double tarif, int nbrheurs, int nbrheurSuppl) {
      super(nbrheurs,tarif,nbrheurSuppl,a);
    }

    @Override
    public double getSalaire() {
        return this.nbrhtravaille *tarif + tarif*nbrheurSuppl*(1+50.0/100.0);
    }
    
}
