import java.util.*;


class PalindromeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        String num = scanner.nextLine();

        int[] numberList = new int[num.length()];
        int i = 0;
        for (Character x : num.toCharArray()) {
            numberList[i] = Character.getNumericValue(x);
            i++;
        }

        int endIndex = numberList.length - 1;
        boolean cond = true;
        for (int j = 0; j <= endIndex/2; j++) {
            if (numberList[j] == numberList[endIndex]) {
                cond = true;
                endIndex--;
            } else {
                cond = false;
                break;
            }
        }
        System.out.println(cond);
    }
}

