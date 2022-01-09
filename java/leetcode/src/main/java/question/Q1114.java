package question;

import java.util.concurrent.Semaphore;

public class Q1114 {
    /*
    Time Complexity: O(1)   Space Complexity: O(1)
     */
    class Foo {
        Semaphore two = new Semaphore(0);
        Semaphore three = new Semaphore(0);

        public Foo() {

        }

        public void first(Runnable printFirst) throws InterruptedException {
            // printFirst.run() outputs "first". Do not change or remove this line.
            printFirst.run();
            two.release();
        }

        public void second(Runnable printSecond) throws InterruptedException {
            two.acquire();
            // printSecond.run() outputs "second". Do not change or remove this line.
            printSecond.run();
            three.release();
        }

        public void third(Runnable printThird) throws InterruptedException {
            three.acquire();
            // printThird.run() outputs "third". Do not change or remove this line.
            printThird.run();
        }
    }
}

/*
1114. Print in Order
 */
