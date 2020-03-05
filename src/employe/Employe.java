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
public abstract class Employe {
protected int nbrhtravaille ;
protected double tarif ; 
protected int nbrheurSuppl;
protected String nom ;
protected String prenom;
protected String id ; 
public Employe(){}
    public Employe(int nbrhtravaille, double tarif, int nbrheurSuppl, String nom) {
        this.nbrhtravaille = nbrhtravaille;
        this.tarif = tarif;
        this.nbrheurSuppl = nbrheurSuppl;
        this.nom = nom;
    }

public abstract double getSalaire();
    /**
     * @param args the command line arguments
     */
  
    
}
