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
public class Classe {
    private static int cpt;
    private int id;
    private String libelle;
    
    
    
    //Contructeurs
     
    public Classe(int id, String libelle) {
        this.id = id;
        this.libelle = libelle;
    }

    //Getters
    public static int getCpt() {
        return cpt; 
    }

    
    public Classe(String liage) {
        throw new UnsupportedOperationException("Not supported yet."); 
    //To change body of generated methods, choose Tools | Templates.
    }

    public int getId() {
        return id;
    }

    public String getLibelle() {
        return libelle;
    }

    

    //Setters

    public static void setCpt(int cpt) {
        Classe.cpt = cpt;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    
    
    
    
    @Override
    public String toString() {
        return "Client{" + "id=" + id + ", libelle=" + libelle + '}';
        //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
