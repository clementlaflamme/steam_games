package com.maisonneuve.steamgames.algorithmes;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TriSelection<T> implements Algorithme<T> {

    @Override
    public String nom() {
        return "Tri Sélection";
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
        for (int i = 0; i < n - 1; i++) {
            int indexMin = i;
            for (int j = i + 1; j < n; j++) {
                if (comp.compare(liste.get(j), liste.get(indexMin)) < 0) {
                    indexMin = j;
                }
            }
            if (indexMin != i) {
                Collections.swap(liste, i, indexMin);
            }
        }
    }
}