package question;

import java.util.Iterator;

public class Q284 {
    /*
    Time Complexity: O(1)   Space Complexity: O(1)
     */
    class PeekingIterator implements Iterator<Integer> {
        public Integer peek = null;
        public Iterator<Integer> it;

        public PeekingIterator(Iterator<Integer> iterator) {
            // initialize any member here.
            it = iterator;
            if (it.hasNext()) {
                peek = it.next();
            }
        }

        // Returns the next element in the iteration without advancing the iterator.
        public Integer peek() {
            return this.peek;
        }

        // hasNext() and next() should behave the same as in the Iterator interface.
        // Override them if needed.
        @Override
        public Integer next() {
            Integer res = peek;
            peek = it.hasNext() ? it.next() : null;
            return res;
        }

        @Override
        public boolean hasNext() {
            return peek != null;
        }
    }
}

/*
284. Peeking Iterator
 */
