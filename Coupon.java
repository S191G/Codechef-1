public class Coupon {
    public static void main(String[] args) {
        // Number of test cases
        int t = 2;

        // Test case 1
        int n1 = 5;
        long x1 = 130;
        long y1 = 30;
        long[] prices1 = {40, 30, 35, 25, 50};

        // Test case 2
        int n2 = 4;
        long x2 = 120;
        long y2 = 20;
        long[] prices2 = {15, 25, 20, 30};

        // Loop through each test case
        for (int test = 1; test <= t; test++) {
            int n;
            long x, y;
            long[] prices;

            // Assign test case values
            if (test == 1) {
                n = n1;
                x = x1;
                y = y1;
                prices = prices1;
            } else {
                n = n2;
                x = x2;
                y = y2;
                prices = prices2;
            }

            int save = 0;

            // Apply the coupon logic
            for (int i = 0; i < n; i++) {
                long price = prices[i];
                if (price >= y) {
                    save += y;
                } else {
                    save += price;
                }
            }

            // Output result
            if (save > x) {
                System.out.println("COUPON");
            } else {
                System.out.println("NO COUPON");
            }
        }
    }
}

