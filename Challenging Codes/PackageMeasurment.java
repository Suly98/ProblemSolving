import java.util.*;

public class PackageMeasurment {
    public static void main(String[] args) {
        String[] s = {"a", "z", "a", "a", "b"};
        Map<String, Integer> alphabets = new HashMap<>();


        System.out.println(measurments(s));
    }

    public static List<Integer> measurments(String[] str) {
        Map<String, Integer> alphabets = new HashMap<>();
        for (int i = 0; i < 26; i++) {
            alphabets.put(String.valueOf((char) ('a' + i)), i + 1);
        }
        alphabets.put("\\p{Punct}", 0);

        int sum = 0;
        int index = 0;
        int count = 1;
        Integer valueOfVar = alphabets.get(str[index]);
        List<Integer> result = new ArrayList<>();

        //str = [azzaaa]
        while (count < str.length && index < str.length) {
            for (int i = 1; i <= valueOfVar; i++) {
                sum = sum + alphabets.get(str[count]);
                count++;
//                if (count >= str.length) {
//                    count = 0;
//                }
            }
            if (str[count - 1].equals("z")) {
                valueOfVar = valueOfVar + 1;
                index = index + count + 1;
                continue;
            } else {
                index = index + alphabets.get(str[index]) + 1;
            }

//            index = index + alphabets.get(str[index]) + 1;

            if (index < str.length) {
                valueOfVar = alphabets.get(str[index]);
            }

            count = index + 1;
            result.add(sum);
            sum = 0;

        }
        return result;

    }
}

//

//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//public class PackageMeasurment {
//
//    private static final Map<Character, Integer> alphabetMap = new HashMap<>();
//
//    static {
//        // Initialize mapping for alphabet letters
//        for (char letter = 'a'; letter <= 'z'; letter++) {
//            int number = letter - 'a' + 1;
//            alphabetMap.put(letter, number);
//        }
//        // Include uppercase letters, if necessary
//        for (char letter = 'A'; letter <= 'Z'; letter++) {
//            int number = letter - 'A' + 1;
//            alphabetMap.put(letter, number);
//        }
//    }
//
//    public static void main(String[] args) {
//        String input = "ba_baaaa";
//        List<Integer> sums = calculateSums(input);
//        System.out.println("Sums: " + sums);
//    }
//
//    private static List<Integer> calculateSums(String input) {
//        List<Integer> sums = new ArrayList<>();
//        // Split input into segments based on '_'
//        String[] segments = input.split("_");
//
//        for (String segment : segments) {
//            if (!segment.isEmpty()) {
//                // Process each segment to calculate the sum
//                sums.add(calculateSum(segment));
//            }
//        }
//
//        return sums;
//    }
//
//    private static int calculateSum(String segment) {
//        if (segment.isEmpty()) return 0;
//
//        // The first letter's value decides how many subsequent letters to count
//        char firstChar = segment.charAt(0);
//        int count = alphabetMap.getOrDefault(firstChar, 0); // Defaults to 0 if not found
//
//        // Calculate sum of the next 'count' letters
//        int sum = 0;
//        for (int i = 1; i <= count && i < segment.length(); i++) {
//            sum += alphabetMap.getOrDefault(segment.charAt(i), 0); // Again, defaults to 0 if not found
//        }
//
//        return sum;
//    }
//}
//public class PackageMeasurment {
//    public static void main(String[] args){
//        String con = "dz_a_aazzaaa";
//
//        System.out.println(measurmentConverter(con));
//
//    }
//
//    public static List<Integer> measurmentConverter(String convertString) {
//        List<Integer> convertedValues = new ArrayList<>();
//        int currentIndex = 0;
//
//        while (currentIndex < convertString.length()) {
//            int count = convertString.charAt(currentIndex) - 'a' + 1;
//            currentIndex++;
//
//            int currentValueNum = 0;
//
//            for (int i = 0; i < count && currentIndex < convertString.length(); i++) {
//                char character = convertString.charAt(currentIndex);
//                if (Character.isLowerCase(character)) {
////                    if (convertString.charAt(currentIndex) == 'z') {
////                        currentIndex++;
////                        System.out.println(currentIndex);
////                    }
//                    if (character == 'z') {
//                        currentValueNum += 26;
//                    }
////                    else if (character == 'z' + '_' || character == 'z' + '-' || character == 'z' + '*'
////                            || character == 'z' + '@' || character == 'z' + '$'
////                            || character == 'z' + '#' || character == 'z' + '%') {
////                        currentValueNum += 26;
////
////                    }
//                    else {
//                        currentValueNum += character - 'a' + 1;
//                    }
//                }
//                currentIndex++;
//            }
//            convertedValues.add(currentValueNum);
//        }
//        return convertedValues;
//    }
//}
//
//
//
//
//
//
//
//
//
