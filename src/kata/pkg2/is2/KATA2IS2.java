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
        Histogram <Integer> histogram = CalCulaHisto.computeHisto(array);
        //HashMap<String, Integer> histograma = histogram.getHisto();
        for (Object key: histogram.keySet()) {
            System.out.println(key+":"+histogram.get(key));
        }
    }

}
