/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import dao.ClasseDao;
import dao.DetailDao;
import dao.InscriptionDao;
import dao.PersonneDao;
import java.util.ArrayList;
import java.util.Date;
import models.Classe;
import models.Etudiant;
import models.Personne;
import models.Professeur;




/**
 *
 * @author hp
 */
public class ServiceDetailBD implements IPersonne{
     private ClasseDao daoClasse;
       private DetailDao daoDetail;
       private PersonneDao daoPersonne;
       private InscriptionDao daoInscription;

    public ServiceDetailBD() {
      daoClasse = new ClasseDao();
        daoDetail = new DetailDao();
        daoPersonne = new PersonneDao();
        daoInscription = new InscriptionDao();
        
    }

    @Override
    public boolean creerPersonne(Personne p) {
        return daoPersonne.create(p)!=0;
    }

    @Override
    public ArrayList<Personne> listerProfesseur() {
        return daoPersonne.selectAll();
    }

    @Override
    public boolean creerPersonne(Etudiant e) {
        return daoPersonne.create(e)!=0;
    }

    @Override
    public ArrayList<Etudiant> listerEtudiant() {
             throw new UnsupportedOperationException("Not supported yet."); 
        // return daoPersonne.selectPersonneByNum(numeroEtudiant);
        
        //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean creerClasse(Classe c) {
        throw new UnsupportedOperationException("Not supported yet."); 
        //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Classe> listerClasse() {
        throw new UnsupportedOperationException("Not supported yet.");
        //To change body of generated methods, choose Tools | Templates.
    }

    
    
   

    
    
}
