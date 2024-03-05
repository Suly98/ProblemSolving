import java.util.Map;
import java.util.HashMap;


class compareTwoHashes {
    public static Map<String, Integer> firstMap = new HashMap<>();
    public static Map<String, Integer> secondMap = new HashMap<>();


    public static void main(String[] args) {
        createHash(firstMap,secondMap);
        checkHashes(firstMap, secondMap);
    }

    // to add keys and values in the Hash
    public static void createHash(Map<String, Integer> firstMap, Map<String, Integer> secondMap) {
        firstMap.put("Ahmed", 1);
        firstMap.put("Nasser", 13);
        firstMap.put("Abdullah", 133);


        secondMap.put("Ahmed", 1);
        secondMap.put("Nasser", 13);
        secondMap.put("Abdullah", 133);
    }

    public static void checkHashes(Map<String, Integer> firstMap, Map<String, Integer> secondMap){
        if (firstMap.equals(secondMap)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }


}
