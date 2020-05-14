/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.net.URL;
import java.util.ArrayList;
import java.util.Date;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import models.Etudiant;
import models.Personne;
import services.ServiceDetailBD;

/**
 *
 * @author hp
 */
public class FXMLDocumentController implements Initializable {
    
    
    @FXML
    private ComboBox<String> cboClasse;
    @FXML
    private ComboBox<String> cboAnneeScolaire;
    private ComboBox<String> cboClass;
    private ComboBox<String> cboAnnee;
    @FXML
    private TextField txtNumero;
    @FXML
    private Button btnInscrireEtudiant;
    @FXML
    private TableView<Etudiant> tblVInfoEtudiant;
    @FXML
    private TableColumn<Etudiant, String> tbleNom;
    @FXML
    private TableColumn<Etudiant, String> tblePrenom;
    @FXML
    private TableColumn<Etudiant, String> tbleClasse;
    private TableColumn<Etudiant, Date> tbleAnneeScolaire;
    
    private ServiceDetailBD service;
    
    ObservableList<Etudiant> obEtudiants;
    private Etudiant et;
    @FXML
    private Button btnSearchClasse;
    @FXML
    private TextField txtPrenom;
    @FXML
    private TextField txtNom;
    @FXML
    private TableColumn<?, ?> tbleAnneeScol;
    //private TableColumn<?, ?> tbleAnnezScol;;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
        /*cboClasse.getItems().add("LIAGE");
        cboClasse.getItems().add("MAE");
        cboClasse.getItems().add("TTL");
        cboClasse.getItems().add("GLRS");
       
        cboClass.getItems().add("LIAGE");
        cboClass.getItems().add("MAE");
        cboClass.getItems().add("TTL");
        cboClass.getItems().add("GLRS");*/
        
        /*cboAnneeScolaire.getItems().add("2017/2018");
        cboAnneeScolaire.getItems().add("2018/2019");
        cboAnneeScolaire.getItems().add("2019/2020");*/
        
       /* cboAnnee.getItems().add("2017/2018");
        cboAnnee.getItems().add("2018/2019");
        cboAnnee.getItems().add("2019/2020");*/
        
        
        service=new ServiceDetailBD();
        /*ArrayList<Etudiant>etudiants = service.listerEtudiant();
        obEtudiants= FXCollections.observableArrayList(etudiants);
        tbleNom.setCellValueFactory(new PropertyValueFactory<>("nom"));
        tblePrenom.setCellValueFactory(new PropertyValueFactory<>("prenom"));
        tbleClasse.setCellValueFactory(new PropertyValueFactory<>("classe"));
        tbleAnneeScol.setCellValueFactory(new PropertyValueFactory<>("anneeScol"));
        tblVInfoEtudiant.setItems(obEtudiants);*/
       
    }    

    @FXML
    private void handleInscrireEtudiantByNum(ActionEvent event) {
       
    }

    @FXML
    private void handleSearchClasseEtudiant(ActionEvent event) {
        
                   
    }
    
}
    