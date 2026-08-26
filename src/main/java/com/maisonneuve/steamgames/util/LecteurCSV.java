package com.maisonneuve.steamgames.util;

import com.maisonneuve.steamgames.model.Genre;
import com.maisonneuve.steamgames.model.Jeu;
import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;
import com.sun.source.tree.WhileLoopTree;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class LecteurCSV {

    public LecteurCSV() {
    }

    public List<Jeu> recupererJeux(String path) throws Exception {
        List<Jeu> jeux = new ArrayList<>();

        try (CSVReader reader = new CSVReader(new FileReader(path))) {
            String[] ligne;
            // Ignorer l'en-tête
            reader.readNext();

            // Parcourir le CSV ligne par ligne et extraire les jeux
            while ((ligne = reader.readNext()) != null) {
                int id = Integer.parseInt(ligne[0].trim());
                String titre = ligne[1].trim();
                String developpeur = ligne[2].trim();
                Genre genre = Genre.valueOf(ligne[3]
                        .trim()
                        .toUpperCase()
                        .replace("&", "AND")
                        .replace(' ', '_'));
                double prix = Double.parseDouble(ligne[4].trim());
                double note = Double.parseDouble(ligne[5].trim());
                int tempsJeuHeures = Integer.parseInt(ligne[6].trim());
                LocalDate dateSortie = LocalDate.parse(ligne[7].trim());

                Jeu jeu = new Jeu(id, titre, developpeur, genre, prix, note, tempsJeuHeures, dateSortie);
                jeux.add(jeu);
            }
            return jeux;
        } catch (Exception e) {
            System.err.println(e.getMessage());
            throw new Exception("Une erreur est survenue lors de la récupération des jeux du CSV");
        }
    }
}
