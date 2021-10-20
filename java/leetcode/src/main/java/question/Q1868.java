package question;

import company.Facebook;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Facebook
public class Q1868 {
    /*
    Time Complexity: O(n)   Space Complexity: O(n)
     */
    public List<List<Integer>> findRLEArray(int[][] encoded1, int[][] encoded2) {
        List<List<Integer>> ans = new ArrayList<>();

        int product = 0;
        int count = 0;
        int i = 0;
        int j = 0;
        while (i < encoded1.length && j < encoded2.length) {
            int val1 = encoded1[i][0];
            int val2 = encoded2[i][0];

            int freq = Math.min(encoded1[i][1], encoded2[j][1]);
            encoded1[i][1] -= freq;
            encoded2[j][1] -= freq;

            int currProduct = val1 * val2;
            if (currProduct == product) {
                count += freq;
            } else {
                if (count > 0) {
                    ans.add(Arrays.asList(product, count));
                }
                product = currProduct;
                count = freq;
            }

            if (encoded1[i][1] == 0) {
                i++;
            }
            if (encoded2[j][1] == 0) {
                j++;
            }
        }

        ans.add(Arrays.asList(product, count));
        return ans;
    }
}

/*
1868. Product of Two Run-Length Encoded Arrays
 */
