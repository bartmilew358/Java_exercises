package pl.sda.collections.Maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Vocabulary {

    public static void main(String[] args) {

        Map<String, String> vocabulary = new HashMap<>();

        //add
        vocabulary.put("kot", "cat");
        vocabulary.put("ptak", "bird");
        vocabulary.put("jeleń", "deer");
        vocabulary.put("szczupak", "bass");
        vocabulary.put("tygrys", "tiger");
        vocabulary.put("cietrzew", "black cock");

        //check
        System.out.println("contains bass: " + vocabulary.containsValue("bass"));
        System.out.println("contains cat: " + vocabulary.containsValue("cat"));
        System.out.println("contains cat: " + vocabulary.containsKey("cat"));
        System.out.println("contains ptak: " + vocabulary.containsKey("bird"));


        //get one element
        String szczupakInEnglish = vocabulary.get("szczupak");
        System.out.println("Szczupak = " + szczupakInEnglish);
        String jeleńInEnglish = vocabulary.get("jeleń");
        System.out.println("Jeleń = " + jeleńInEnglish);

        //remove
        String removed = vocabulary.remove("kot");
        System.out.println("contains kot: " + vocabulary.containsValue("kot"));
        String removed2 = vocabulary.remove("jeleń");
        System.out.println("Jeleń = " + jeleńInEnglish);

        //size of map
        System.out.println(vocabulary.size());

        //write whole map
        Set<String> keys = vocabulary.keySet();
        for (String key : keys) {
            System.out.println(key + " = " + vocabulary.get(key));
        }
    }

}
