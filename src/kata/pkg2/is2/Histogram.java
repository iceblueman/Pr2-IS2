/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata.pkg2.is2;

import java.util.HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author javier
 */

public class Histogram<T> {

  private final Map<T,Integer> map = new HashMap<>();

    public Integer get(Object o) {
        return map.get(o);
    }

    public Set<T> keySet() {
        return map.keySet();
    }
    public void increment(T key){
        map.put(key, map.containsKey(key)?map.get(key)+1:1);
    }
}


