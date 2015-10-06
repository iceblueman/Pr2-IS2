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
public class KATA2IS2 {

    /**
     * HASHMAP
     */
    public static void main(String[] args) {
        Integer[] array = {1, 4, 7, 1, 1, 8, 4, 1, 4, 9};
        String[] array1={"Ana","Juan","Pedro","Ana","Juan","Pedro","Ana","Juan","Pedro"};
        Histogram histo = new Histogram(array1);
        HashMap<String, Integer> histograma = histo.getHisto();
        for (Object key: histograma.keySet()) {
            System.out.println(key+":"+histograma.get(key));
        }
    }

}
