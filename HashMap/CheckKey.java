import java.util.Map;
import java.util.HashMap;


class CheckKey {
    public static Map<String, Integer> numberMap = new HashMap<>();

    public static void main(String[] args) {
        createHash(numberMap);
        checkHash(numberMap);
    }

    // to add keys and values in the Hash
    public static void createHash(Map<String, Integer> map) {
        numberMap.put("Suliman", 25);
        numberMap.put("Nasser", 19);
        numberMap.put("Abdullah", 26);
        numberMap.put("Hussain", 17);
        numberMap.put("Majed", 36);
    }

    // Check if a value is there!
    public static void checkHash(Map<String, Integer> numberMap) {

        System.out.println(numberMap.containsValue(98));

        System.out.println(numberMap);

    }

    // remove a key that we don't want in the Map:
    public static void removeHash(Map<String, Integer> numberMap) {
        numberMap.remove("Hussain");
        numberMap.remove("Nasser");
    }

}


