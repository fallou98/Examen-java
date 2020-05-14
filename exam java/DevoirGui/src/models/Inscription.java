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
public class Inscription {
    //proprietes
    private Date date;
    private Date anneeScolaire;
    //propietes de navigation
    protected Classe classe;
    protected Etudiant etudiant;
    //methodes
   
    //constructeurs
     public Inscription(Date date, Date anneeScolaire, Classe classe, Etudiant etudiant) {
        this.date = date;
        this.anneeScolaire = anneeScolaire;
        this.classe = classe;
        this.etudiant = etudiant;
    }
    //getters

    public Date getDate() {
        return date;
    }

    public Date getAnneeScolaire() {
        return anneeScolaire;
    }

    public Classe getClasse() {
        return classe;
    }

    public Etudiant getEtudiant() {
        return etudiant;
    }
    
        
    //setters

    public void setDate(Date date) {
        this.date = date;
    }

    public void setAnneeScolaire(Date anneeScolaire) {
        this.anneeScolaire = anneeScolaire;
    }

    public void setClasse(Classe classe) {
        this.classe = classe;
    }

    public void setEtudiant(Etudiant etudiant) {
        this.etudiant = etudiant;
    }

    @Override
    public String toString() {
        return "Inscription{" + " date = " + date  +" anneeScolaire = " + anneeScolaire  +" classe = " + classe  +" etudiant = " + etudiant + '}'; 
    //To change body of generated methods, choose Tools | Templates.
    }

    
   
}
