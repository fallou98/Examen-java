/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.util.Date;

/**
 *
 * @author hp
 */
public class Detail {
    //proprietes
    private Date anneeScolaire;
    //methodes
    protected Classe classe;
    protected Professeur professeur;
    //constructors
    public Detail(Date anneeScolaire, Classe classe, Professeur professeur) {
        this.anneeScolaire = anneeScolaire;
        this.classe = classe;
        this.professeur = professeur;
    }
    //getters
     public Date getAnneeScolaire() {
        return anneeScolaire;
    }

    public Classe getClasse() {
        return classe;
    }

    public Professeur getProfesseur() {
        return professeur;
    }
    //setters
    public void setAnneeScolaire(Date anneeScolaire) {
        this.anneeScolaire = anneeScolaire;
    }

    public void setClasse(Classe classe) {
        this.classe = classe;
    }

    public void setProfesseur(Professeur professeur) {
        this.professeur = professeur;
    }
    //proprietes 

    @Override
    public String toString() {
        return "Inscription{" +" anneeScolaire = " + anneeScolaire  +" classe = " + classe  +" professeur = " + professeur + '}';
     

    //To change body of generated methods, choose Tools | Templates.
    }

    

   

   
}
