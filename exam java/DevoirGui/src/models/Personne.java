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
public abstract class Personne {
    protected static int cpt;
    //proprietes
    protected int id;
    protected String nom;
    protected String prenom;
    protected Date dateNaissance;
    protected String numero;
    
    //propietes de navigation
    
    //methodes
   
    //constructeurs
    public Personne(int id) {
        this.id = id;
    }
    //getters
     public static int getCpt() {
        return cpt;
    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public Date getDateNaissance() {
        return dateNaissance;
    }

    public String getNumero() {
        return numero;
    }
   
    //setters
   
    public void setId(int id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
 
    //methodes metiers

    @Override
    public String toString() {
        return "Personne{" + "id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", dateNaissance=" + dateNaissance + ", numero=" + numero + '}';
    }

    public void setDateNaissance(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
