package collections.hash;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by anton on 6/23/2018 4:07 AM
 **/
public class MapDemo {
    public static void main(String[] args) {
        HashMap<String,Integer> hashMap = new HashMap<>();
        hashMap.put("John",23);
        hashMap.put("Anita",20);
        hashMap.put("Antony",38);

        // Iterating

        Set<Map.Entry<String,Integer>> mappings = hashMap.entrySet();


        for (Map.Entry<String,Integer> mapping : mappings) {
            System.out.println(mapping.getKey() + " -- " + mapping.getValue());
        }
    }
}
