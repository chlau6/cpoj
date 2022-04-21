package question;

public class Q470 {
    class Solution extends SolBase {
        public int rand10() {
            while (true) {
                int num = (rand7() - 1) * 7 + rand7();
                if (num <= 40) return num % 10 + 1;
            }
        }
    }

    class SolBase {
        int rand7() {
            return 0; // implementation is hidden
        }
    }
}

/*
470. Implement Rand10() Using Rand7()
 */
