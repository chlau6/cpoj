#include<bits/stdc++.h>

using namespace std;

class MyQueue {
public:
    stack<int> oldStack;
    stack<int> newStack;

    MyQueue() {

    }

    void push(int x) {
        newStack.push(x);
    }

    int pop() {
        transfer();

        int num = oldStack.top();
        oldStack.pop();

        return num;
    }

    int peek() {
        transfer();

        return oldStack.top();
    }

    bool empty() {
        return oldStack.empty() && newStack.empty();
    }

    void transfer() {
        if (!oldStack.empty()) return;

        while (!newStack.empty()) {
            int num = newStack.top();
            newStack.pop();
            oldStack.push(num);
        }
    }
};