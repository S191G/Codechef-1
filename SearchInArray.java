public class SearchInArray {
    public static void main(String[] args) {
        int N = 5; // size of the array
        int X = 30; // element to search

        int[] arr = {10, 20, 30, 40, 50}; // the array

        boolean found = false;

        for (int i = 0; i < N; i++) {
            if (arr[i] == X) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
