package com.maisonneuve.steamgames.algorithmes;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TriInsertion<T> implements Algorithme<T> {

    @Override
    public String nom() {
        return "Tri Insertion";
    }

    @Override
    public String complexiteTheorique() {
        return "O(n²)";
    }

    @Override
    public void trier(List<T> liste, Comparator<T> comp) {
        if (liste == null || liste.size() < 2) {
            return;
        }

        int n = liste.size();
        for (int i = 1; i < n; i++) {
            T courant = liste.get(i);
            int j = i - 1;
            while (j >= 0 && comp.compare(liste.get(j), courant) > 0) {
                liste.set(j + 1, liste.get(j));
                j--;
            }
            liste.set(j + 1, courant);
        }
    }
}