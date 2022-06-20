package question;

public class Q622 {
    class MyCircularQueue {
        int[] q;
        int front = 0;
        int back = -1;
        int size = 0;

        public MyCircularQueue(int k) {
            q = new int[k];
        }

        public boolean enQueue(int value) {
            if (isFull()) return false;

            back = (back + 1) % q.length;
            q[back] = value;
            size++;

            return true;
        }

        public boolean deQueue() {
            if (isEmpty()) return false;

            front = (front + 1) % q.length;
            size--;

            return true;
        }

        public int Front() {
            if (isEmpty()) return -1;

            return q[front];
        }

        public int Rear() {
            if (isEmpty()) return -1;

            return q[back];
        }

        public boolean isEmpty() {
            return size == 0;
        }

        public boolean isFull() {
            return size == q.length;
        }
    }
}

/*
622. Design Circular Queue
 */
