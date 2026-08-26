package com.maisonneuve.steamgames.algorithmes;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TriBulle<T> implements Algorithme<T> {

    @Override
    public String nom() {
        return "Tri Bulle";
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
            for (int j = 0; j < n - 1 - i; j++) {
                if (comp.compare(liste.get(j), liste.get(j + 1)) > 0) {
                    Collections.swap(liste, j, j + 1);
                }
            }
        }
    }
}