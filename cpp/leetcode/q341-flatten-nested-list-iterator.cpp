#include<bits/stdc++.h>

using namespace std;

class NestedInteger {
public:
    // Return true if this NestedInteger holds a single integer, rather than a nested list.
    bool isInteger() const;

    // Return the single integer that this NestedInteger holds, if it holds a single integer
    // The result is undefined if this NestedInteger holds a nested list
    int getInteger() const;

    // Return the nested list that this NestedInteger holds, if it holds a nested list
    // The result is undefined if this NestedInteger holds a single integer
    const vector<NestedInteger> &getList() const;
};

class NestedIterator {
public:
    stack<NestedInteger> stack;

    NestedIterator(vector<NestedInteger> &nestedList) {
        prepare(nestedList);
    }

    int next() {
        NestedInteger nestedInteger = stack.top();
        stack.pop();

        return nestedInteger.getInteger();
    }

    bool hasNext() {
        while (!stack.empty()) {
            NestedInteger nestedInteger = stack.top();

            if (nestedInteger.isInteger()) return true;

            stack.pop();

            prepare(nestedInteger.getList());
        }

        return false;
    }

    void prepare(vector<NestedInteger>& nestedList) {
        int n = nestedList.size();

        for (int i = n - 1; i >= 0; i--) {
            stack.push(nestedList[i]);
        }
    }
};