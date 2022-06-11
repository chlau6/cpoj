package question;

import java.util.HashMap;
import java.util.Map;

public class Q1357 {
    class Cashier {
        int counter = 0;
        int n;
        int discount;
        Map<Integer, Integer> map = new HashMap<>();

        public Cashier(int n, int discount, int[] products, int[] prices) {
            this.n = n;
            this.discount = discount;

            int p = products.length;
            for (int i = 0; i < p; i++) {
                map.put(products[i], prices[i]);
            }
        }

        public double getBill(int[] product, int[] amount) {
            double sum = 0;
            int p = product.length;

            for (int i = 0; i < p; i++) {
                int price = map.get(product[i]);
                sum += price * amount[i];
            }

            if (++counter == n) {
                sum = sum - (sum * discount / 100);
                counter = 0;
            }

            return sum;
        }
    }
}

/*
1357. Apply Discount Every n Orders
 */
