/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author hp
 */
public class Etudiant extends Personne {
    

    //proprietes
    private String tuteur;
    //propietes de navigation
    
    //methodes
   
    //constructeurs

    public Etudiant(String tuteur, int id) {
        super(id);
        this.tuteur = tuteur;
    }

        //public Etudiant() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    //}
    
    

    //Getters
     public String getTuteur() {
        return tuteur;
    }
    
    //Setters
     public void setTuteur(String tuteur) {
        this.tuteur = tuteur;
    }
    //methodes metiers    

    @Override
    public String toString() {
        return super.toString() +" tuteur = " + tuteur ; 
    //To change body of generated methods, choose Tools | Templates.
    }

    
   
    
    
}
