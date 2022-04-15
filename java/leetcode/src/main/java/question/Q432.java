package question;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Q432 {
    class Bucket {
        public int count;
        public Set<String> words;
        public Bucket prev;
        public Bucket next;

        public Bucket(int count) {
            this.count = count;
            this.words = new HashSet<>();
        }
    }

    class AllOne {
        public Map<Integer, Bucket> bucketsMap;
        public Map<String, Integer> countsMap;
        public Bucket head;
        public Bucket tail;

        public AllOne() {
            bucketsMap = new HashMap<>();
            countsMap = new HashMap<>();

            head = new Bucket(Integer.MIN_VALUE);
            tail = new Bucket(Integer.MAX_VALUE);

            head.prev = null;
            head.next = tail;
            tail.prev = head;
            tail.next = null;
        }

        public void deleteKey(Bucket bucket, String key) {
            bucket.words.remove(key);

            if (bucket.words.isEmpty()) {
                deleteBucket(bucket);
                bucketsMap.remove(bucket.count);
            }
        }

        public void deleteBucket(Bucket bucket) {
            bucket.prev.next = bucket.next;
            bucket.next.prev = bucket.prev;
        }

        public void addBucket(Bucket newBucket, Bucket prevBucket) {
            newBucket.prev = prevBucket;
            newBucket.next = prevBucket.next;
            prevBucket.next.prev = newBucket;
            prevBucket.next = newBucket;
        }

        public void changeKey(String key, int offset) {
            int count = countsMap.get(key);

            countsMap.put(key, count + offset);
            Bucket currBucket = bucketsMap.get(count);
            Bucket newBucket;

            if (bucketsMap.containsKey(count + offset)) {
                newBucket = bucketsMap.get(count + offset);
            } else {
                newBucket = new Bucket(count + offset);
                bucketsMap.put(count + offset, newBucket);
                addBucket(newBucket, offset == 1 ? currBucket : currBucket.prev);
            }

            newBucket.words.add(key);
            deleteKey(currBucket, key);
        }

        public void inc(String key) {
            if (countsMap.containsKey(key)) {
                changeKey(key, 1);
            } else {
                countsMap.put(key, 1);
                if (head.next.count != 1) {
                    addBucket(new Bucket(1), head);
                }
                head.next.words.add(key);
                bucketsMap.put(1, head.next);
            }
        }

        public void dec(String key) {
            int count = countsMap.get(key);
            if (count == 1) {
                countsMap.remove(key);
                deleteKey(bucketsMap.get(count), key);
            } else {
                changeKey(key, -1);
            }
        }

        public String getMaxKey() {
            return tail.prev == head ? "" : tail.prev.words.iterator().next();
        }

        public String getMinKey() {
            return head.next == tail ? "" : head.next.words.iterator().next();
        }
    }
}
/*
430. Flatten a Multilevel Doubly Linked List
 */
