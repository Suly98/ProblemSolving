import java.util.Map;
import java.util.HashMap;


class RetrieveValue {
    public static Map<String, Integer> numberMap = new HashMap<>();

    public static void main(String[] args) {
        createHash(numberMap);
        retrieveValue(numberMap);
    }

    // to add keys and values in the Hash
    public static void createHash(Map<String, Integer> map) {
        numberMap.put("Sulaiman", 25);
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

    public static void retrieveValue(Map<String, Integer> numberMap){
        for(String key: numberMap.keySet()){
            if (key.equals("Sulaiman")){
                System.out.println("The id of Sulaiman = "+ numberMap.get(key));
            }
        }
    }

}
