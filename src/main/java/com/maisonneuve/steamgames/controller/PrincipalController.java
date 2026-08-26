package com.maisonneuve.steamgames.controller;

import com.maisonneuve.steamgames.algorithmes.Algorithme;
import com.maisonneuve.steamgames.algorithmes.TriBulle;
import com.maisonneuve.steamgames.algorithmes.TriFusion;
import com.maisonneuve.steamgames.algorithmes.TriInsertion;
import com.maisonneuve.steamgames.algorithmes.TriRapide;
import com.maisonneuve.steamgames.algorithmes.TriSelection;
import com.maisonneuve.steamgames.util.LecteurCSV;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

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
}
