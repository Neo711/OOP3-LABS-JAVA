import java.util.List;

public class BinarySearch {

    public static int binarySearch(List<Integer> sortedList, int target) {
        int left = 0;
        int right = sortedList.size() - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;  

            if (sortedList.get(mid) == target) {
                return mid;  
            } else if (sortedList.get(mid) < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;  
    }

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        System.out.println(binarySearch(numbers, 5)); // should return 4 (0-based index)
        System.out.println(binarySearch(numbers, 11)); // should return -1
    }
}
