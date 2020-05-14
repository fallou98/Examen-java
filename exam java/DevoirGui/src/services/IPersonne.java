/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import java.util.ArrayList;
import models.Classe;
import models.Etudiant;
import models.Personne;

/**
 *
 * @author hp
 */
public interface IPersonne {
    public boolean creerPersonne(Personne p);
    public ArrayList<Personne> listerProfesseur();
    public boolean creerPersonne(Etudiant e);
    public ArrayList<Etudiant> listerEtudiant();
    public boolean creerClasse(Classe c);
    public ArrayList<Classe> listerClasse();
    
}
