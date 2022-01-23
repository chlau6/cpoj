package question;

public class Q641 {
    class MyCircularDeque {
        int[] deque;
        int head;
        int tail;
        int size;
        int maxSize;

        /**
         * Initialize your data structure here. Set the size of the deque to be k.
         */
        public MyCircularDeque(int k) {
            deque = new int[k];
            maxSize = k;
            size = 0;
            head = k - 1;
            tail = 0;
        }

        /**
         * Adds an item at the front of Deque. Return true if the operation is successful.
         */
        public boolean insertFront(int value) {
            if (isFull()) return false;

            deque[head] = value;
            head = (head - 1 + maxSize) % maxSize;
            size++;

            return true;
        }

        /**
         * Adds an item at the rear of Deque. Return true if the operation is successful.
         */
        public boolean insertLast(int value) {
            if (isFull()) return false;

            deque[tail] = value;
            tail = (tail + 1) % maxSize;
            size++;

            return true;
        }

        /**
         * Deletes an item from the front of Deque. Return true if the operation is successful.
         */
        public boolean deleteFront() {
            if (isEmpty()) return false;

            head = (head + 1) % maxSize;
            size--;

            return true;
        }

        /**
         * Deletes an item from the rear of Deque. Return true if the operation is successful.
         */
        public boolean deleteLast() {
            if (isEmpty()) return false;

            tail = (tail - 1 + maxSize) % maxSize;
            size--;

            return true;
        }

        /**
         * Get the front item from the deque.
         */
        public int getFront() {
            return isEmpty() ? -1 : deque[(head + 1) % maxSize];
        }

        /**
         * Get the last item from the deque.
         */
        public int getRear() {
            return isEmpty() ? -1 : deque[(tail - 1 + maxSize) % maxSize];
        }

        /**
         * Checks whether the circular deque is empty or not.
         */
        public boolean isEmpty() {
            return size == 0;
        }

        /**
         * Checks whether the circular deque is full or not.
         */
        public boolean isFull() {
            return size == maxSize;
        }
    }
}
