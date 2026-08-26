package com.maisonneuve.steamgames.controller;

import com.maisonneuve.steamgames.model.Bibliotheque;
import com.maisonneuve.steamgames.model.Jeu;
import com.maisonneuve.steamgames.util.LecteurCSV;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.util.ArrayList;
import java.util.List;

public class PrincipalController {

    @FXML
    private CheckBox checkWishlist;

    @FXML
    private Label labelDev, labelGenre, labelPrix, labelNote, labelTempsJeu, labelDate, labelMessage;

    @FXML
    private ComboBox comboGenre;

    @FXML
    private TextField textPrixMax, textTitre;

    @FXML
    private Spinner spinNoteMin;

    @FXML
    private Button btnWishlist;

    @FXML
    private ListView<Jeu> listGames;

    private Bibliotheque biblio = new Bibliotheque();
    private LecteurCSV lecteur = new LecteurCSV();
    private List<Jeu> jeux = new ArrayList<>();

    @FXML
    public void initialize() {
        chargerListeJeux();
    }

    public void chargerListeJeux() {
        try {
            biblio.chargerDepuisCSV("src/main/resources/data/jeux.csv", lecteur);
            jeux = biblio.getJeux();
            listGames.setItems(FXCollections.observableArrayList(jeux));
        } catch (Exception e) {
            labelMessage.setText(e.getMessage());
        }
    }
}
