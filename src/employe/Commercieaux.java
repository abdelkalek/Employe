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
class Commercieaux extends Employe {

   public Commercieaux() {}
    Commercieaux(String a, double tarif, int nbrheurs, int nbrheurSuppl) {
      super(nbrheurs,tarif,nbrheurSuppl,a);
    }

    @Override
    public double getSalaire() {
        return this.nbrhtravaille *tarif + tarif*nbrheurSuppl*(1+75.0/100.0);
    }
    
}
