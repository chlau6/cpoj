package question;

import annotation.Array;
import annotation.MonotonicStack;
import annotation.Stacks;

import java.util.Stack;

@Array
@Stacks
@MonotonicStack
public class Q1475 {
    /*
    Time Complexity: O(n)  Space Complexity: O(n)
     */
    public int[] finalPrices(int[] prices) {
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < prices.length; i++) {
            while (!stack.isEmpty() && prices[stack.peek()] >= prices[i]) {
                prices[stack.pop()] -= prices[i];
            }

            stack.push(i);
        }

        return prices;
    }
}

/*
1475. Final Prices With a Special Discount in a Shop
 */
