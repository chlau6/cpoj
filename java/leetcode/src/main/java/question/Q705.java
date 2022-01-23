package question;

public class Q705 {
    class MyHashSet {
        boolean[] hashSet = new boolean[1000001];

        public MyHashSet() {

        }

        public void add(int key) {
            hashSet[key] = true;
        }

        public void remove(int key) {
            hashSet[key] = false;
        }

        public boolean contains(int key) {
            return hashSet[key];
        }
    }
}

/*
704. Binary Search
 */
