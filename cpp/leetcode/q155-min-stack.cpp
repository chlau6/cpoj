#include<bits/stdc++.h>

using namespace std;

class MinStack {
public:
    int min = INT_MAX;
    stack<int> s;

    MinStack() {

    }

    void push(int val) {
        if (val <= min) {
            s.push(min);
            min = val;
        }
        s.push(val);
    }

    void pop() {
        int num = s.top();
        s.pop();

        if (num == min) {
            min = s.top();
            s.pop();
        }
    }

    int top() {
        return s.top();
    }

    int getMin() {
        return min;
    }
};