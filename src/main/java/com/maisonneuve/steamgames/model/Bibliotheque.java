package com.maisonneuve.steamgames.model;

import com.maisonneuve.steamgames.util.LecteurCSV;

import java.util.ArrayList;
import java.util.List;

public class Bibliotheque {
    private List<Jeu> jeux;

    // Constructeur avec une liste existante
    public Bibliotheque(List<Jeu> jeux) {
        this.jeux = new ArrayList<>(jeux) {
        };
    }

    // Constructeur avec une liste vide
    public Bibliotheque() {
        this.jeux = new ArrayList<>() {
        };
    }

    public void chargerDepuisCSV(String path, LecteurCSV lecteur) throws Exception {
        jeux = lecteur.recupererJeux(path);

    }

    public void ajouter(Jeu j) {
        if (!jeux.contains(j)) {
            jeux.add(j);
        } else {
            throw new IllegalArgumentException("Le jeu " + j.getTitre() + " figure déjà dans votre bibliothèque");
        }
    }

    public void supprimer(int id) {
        boolean estSupprime = jeux.removeIf((j) -> j.getId() == id);
        if (!estSupprime) {
            throw new IllegalArgumentException("L'id " + id + " ne correspond à aucun jeu dans la bibliothèque.");
        }
    }

    public void setJeux(List<Jeu> jeux) {
        this.jeux = jeux;
    }

    @Override
    public String toString() {
        return "Bibliotheque{" +
                "jeux=" + jeux +
                '}';
    }

    public List<Jeu> getJeux() {
        return jeux;
    }
}
