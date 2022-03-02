#include<bits/stdc++.h>

using namespace std;

class Iterator {
    struct Data;
    Data* data;

public:
    Iterator(const vector<int>& nums);
    Iterator(const Iterator& iter);
    // Returns the next element in the iteration.
    int next();
    // Returns true if the iteration has more elements.
    bool hasNext() const;
};

class PeekingIterator : public Iterator {
public:
    int iteratorNext;
    bool iteratorHasNext;
	PeekingIterator(const vector<int>& nums) : Iterator(nums) {
	    // Initialize any member here.
	    // **DO NOT** save a copy of nums and manipulate it directly.
	    // You should only use the Iterator interface methods.
        iteratorHasNext = Iterator::hasNext();
        if (iteratorHasNext) {
            iteratorNext = Iterator::next();
        }
	}

    // Returns the next element in the iteration without advancing the iterator.
	int peek() {
        return iteratorNext;
	}

	// hasNext() and next() should behave the same as in the Iterator interface.
	// Override them if needed.
	int next() {
	    int result = iteratorNext;

        iteratorHasNext = Iterator::hasNext();
        if (iteratorHasNext) {
            iteratorNext = Iterator::next();
        }

        return result;
	}

	bool hasNext() const {
	    return iteratorHasNext;
	}
};