package seven;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

/**
 * UGOVOR između equals() i hashCode()
 * ... p1.equals(p2) -> true
 * .... p1.hashCode 1234
 * .... p2.hashCode 1234
 */
public class MapTester {


    // HASHING -> short verziju int
    // HashTable  100000 put -> 100 000
    // 16 bucketa
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Albin", 233);  //
        map.put("Emir", 23);
        map.put("Emir", 23);
        map.put("Emir", 23);
        map.put("Boris", 123);
        map.put("Nevena", 340);
        map.put("Elma", 34);

        /*for(Map.Entry<String, Integer> entry : map.entrySet()){
            String kljuc = entry.getKey();
            Integer vrijednost = entry.getValue();
            System.out.printf("Key: %s - Value: %s%n", kljuc, vrijednost);
        }*/
    }

    static void removeElement(List<String> list, int index) {
        list.remove(index);
    }
}
