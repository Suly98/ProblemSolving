import java.util.Map;


class HashMap {
    public static Map<String, Integer> numberMap = new java.util.HashMap<>();

    public static void main(String[] args){
        createHash(numberMap);
    }

    public static Map<String,Integer> createHash(Map<String, Integer> map) {
        numberMap.put("Suliman", 25);
        numberMap.put("Nasser", 19);
        numberMap.put("Abdullah", 26);
        numberMap.put("Hussain", 17);
        numberMap.put("Majed", 36);

        System.out.println(numberMap);
    }



}
