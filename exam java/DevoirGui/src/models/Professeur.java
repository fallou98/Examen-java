/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

//import java.util.Date;

/**
 *
 * @author hp
 */
public class Professeur extends Personne  {
    //proprietes
    private String grade;
    //propietes de navigation
    
    //methodes
   
    //constructeurs
    public Professeur(String grade, int id) {
        super(id);
        this.grade = grade;
    }

   
   

    //Getters
     public String getGrade() {
        return grade;
    }

   
    //Setters
     public void setGrade(String grade) {
        this.grade = grade;
    }

    

    //methodes metiers
      
    
    @Override
    public String toString() {
        return super.toString() +" grade = " + grade ; 
    //To change body of generated methods, choose Tools | Templates.
    }

   
   

   
    

   

   
}
