#include<bits/stdc++.h>

using namespace std;

class NestedInteger {
public:
    // Constructor initializes an empty nested list.
    NestedInteger() {};

    // Constructor initializes a single integer.
    NestedInteger(int value) {};

    // Return true if this NestedInteger holds a single integer, rather than a nested list.
    bool isInteger() const {};

    // Return the single integer that this NestedInteger holds, if it holds a single integer
    // The result is undefined if this NestedInteger holds a nested list
    int getInteger() const {};

    // Set this NestedInteger to hold a single integer.
    void setInteger(int value) {};

    // Set this NestedInteger to hold a nested list and adds a nested integer to it.
    void add(const NestedInteger &ni) {};

    // Return the nested list that this NestedInteger holds, if it holds a nested list
    // The result is undefined if this NestedInteger holds a single integer
    const vector<NestedInteger> &getList() const {};
};

class Solution {
public:
    NestedInteger deserialize(string s) {
        if (s.empty()) return NestedInteger();
        if (s[0] != '[') return NestedInteger(stoi(s));

        stack<NestedInteger> stack;
        int start = 1;
        int n = s.size();

        for (int i = 0; i < n; i++) {
            if (s[i] == '[') {
                stack.push(NestedInteger());
                start = i + 1;
            } else if (s[i] == ',' || s[i] == ']') {
                if (i > start) {
                    stack.top().add(NestedInteger(stoi(s.substr(start, i - start))));
                }

                start = i + 1;

                if (s[i] == ']' && stack.size() > 1) {
                    NestedInteger top = stack.top();
                    stack.pop();
                    stack.top().add(top);
                }
            }
        }

        return stack.top();
    }
};