package com.maisonneuve.steamgames.model;

import java.time.LocalDate;

public class Jeu {
    private int id;
    private String titre;
    private String developpeur;
    private Genre genre;
    private double prix;
    private double note; // de 0-10
    private int tempsJeuHeures;
    private LocalDate dateSortie;
    private boolean estFavori;
    private boolean estDansWishlist;

    // Constructeur avec estFavori et estDansWishlist
    public Jeu(int id, String titre, String developpeur, Genre genre, double prix, double note, int tempsJeuHeures, LocalDate dateSortie, boolean estFavori, boolean estDansWishlist) {
        this.id = id;
        this.titre = titre;
        this.developpeur = developpeur;
        this.genre = genre;
        this.prix = prix;
        setNote(note);
        this.tempsJeuHeures = tempsJeuHeures;
        this.dateSortie = dateSortie;
        this.estFavori = estFavori;
        this.estDansWishlist = estDansWishlist;
    }

    // Constructeur sans estFavori
    public Jeu(int id, String titre, String developpeur, Genre genre, double prix, double note, int tempsJeuHeures, LocalDate dateSortie) {
        this(id, titre, developpeur, genre, prix, note, tempsJeuHeures, dateSortie, false, false);
    }

    @Override
    public String toString() {
        return titre + " [" + genre + "]";
    }

    public void setNote(double note) {
        if (0 <= note && note <= 10) {
            this.note = note;
        } else {
            throw new IllegalArgumentException("La note doit être contenue entre 0 et 10");
        }
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public void setDeveloppeur(String developpeur) {
        this.developpeur = developpeur;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public void setTempsJeuHeures(int tempsJeuHeures) {
        this.tempsJeuHeures = tempsJeuHeures;
    }

    public void setDateSortie(LocalDate dateSortie) {
        this.dateSortie = dateSortie;
    }

    public int getId() {
        return id;
    }

    public String getTitre() {
        return titre;
    }

    public String getDeveloppeur() {
        return developpeur;
    }

    public Genre getGenre() {
        return genre;
    }

    public double getPrix() {
        return prix;
    }

    public double getNote() {
        return note;
    }

    public int getTempsJeuHeures() {
        return tempsJeuHeures;
    }

    public LocalDate getDateSortie() {
        return dateSortie;
    }

    public void setEstFavori(boolean estFavori) {
        this.estFavori = estFavori;
    }

    public boolean isEstFavori() {
        return estFavori;
    }

    public void setEstDansWishlist(boolean estDansWishlist) {
        this.estDansWishlist = estDansWishlist;
    }

    public boolean estDansWishlist() {
        return estDansWishlist;
    }
}
