import java.util.Map;
import java.util.HashMap;


class HashMapSize {
    public static Map<String, Integer> numberMap = new HashMap<>();

    public static void main(String[] args) {
        createHash(numberMap);
        mapSize(numberMap);
    }

    // to add keys and values in the Hash
    public static void createHash(Map<String, Integer> map) {
        numberMap.put("Sulaiman", 25);
        numberMap.put("Nasser", 19);
        numberMap.put("Abdullah", 26);
        numberMap.put("Hussain", 17);
        numberMap.put("Majed", 36);
        System.out.println(numberMap);
    }

    // Check if a value is there!
    public static void checkHash(Map<String, Integer> numberMap) {

        System.out.println(numberMap.containsValue(98));

        System.out.println(numberMap);

    }

    // remove a key that we don't want in the Map:
    public static void removeHash(Map<String, Integer> numberMap) {
        System.out.println("The map before deleting is: " + numberMap);

        numberMap.remove("Hussain");
        numberMap.remove("Nasser");

        System.out.println("The map after deleting: " + numberMap);
    }

    public static void retrieveValue(Map<String, Integer> numberMap) {
        for (String key : numberMap.keySet()) {
            if (key.equals("Sulaiman")) {
                System.out.println("The id of Sulaiman = " + numberMap.get(key));
            }
        }
    }

    public static void clearHash(Map<String, Integer> numberMap) {
        numberMap.clear();
        if (numberMap.isEmpty()) {
            System.out.println("The numberMap is Empty: " + numberMap);
        } else {
            System.out.println("The numberMap is not Empty! ");
        }
    }

    public static void mapSize(Map<String, Integer> numberMap){
        System.out.println(numberMap.size());
    }

}
