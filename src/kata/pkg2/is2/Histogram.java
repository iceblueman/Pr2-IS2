/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata.pkg2.is2;

import java.util.HashMap;

/**
 *
 * @author javier
 */
public class Histogram<T> {

    private final T[] vector;

    public Histogram(T[] vector) {
        this.vector = vector;
    }

    public T[] getVector() {
        return vector;
    }

    public HashMap<T, Integer> getHisto() {
        HashMap<T, Integer> histo = new HashMap<>();
        for (int i = 0; i < vector.length; i++) {
            if (!histo.containsKey(vector[i])) {
                histo.put(vector[i], 0);
            }
            histo.put(vector[i], histo.get(vector[i])+1);
        }
        return histo;
    }
}
