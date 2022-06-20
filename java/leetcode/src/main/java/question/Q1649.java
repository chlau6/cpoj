package question;

public class Q1649 {
    int[] array;
    public int createSortedArray(int[] instructions) {
        int result = 0;
        int n = instructions.length;
        int mod = 1000000007;
        array = new int[100001];

        for (int i = 0; i < n; i++) {
            result = (result + Math.min(get(instructions[i] - 1), i - get(instructions[i]))) % mod;
            update(instructions[i]);
        }

        return result;
    }

    public void update(int x) {
        while (x < 100001) {
            array[x]++;
            x += x & -x;
        }
    }

    public int get(int x) {
        int result = 0;
        while (x > 0) {
            result += array[x];
            x -= x & -x;
        }

        return result;
    }
}

/*
1649. Create Sorted Array through Instructions
 */
