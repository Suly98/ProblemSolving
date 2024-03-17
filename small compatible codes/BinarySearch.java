

public class BinarySearch {
    public static int binarsearch(int[] array, int target){
        int first = 0;
        int last = array.length-1;

        while (first <= last) {
            int halfLength = (first+last) / 2;

            if (array[halfLength] == target){
                return halfLength;
            }

            else if (array[halfLength] > target) {
                last = halfLength -1;
            }

            else {
                first = halfLength + 1;
            }
        }

        return -1;
    }

    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6};
        int target = 1;

        int result = binarsearch(arr, target);

        if (result == -1){
            System.out.println("Element is not fount!");
        } else{
            System.out.println("Element found at index: " + result);
        }
    }
}