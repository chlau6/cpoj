#include<bits/stdc++.h>

using namespace std;

class MedianFinder {
public:
    priority_queue<int, vector<int>, greater<int>> upper;
    priority_queue<int> lower;
    bool isEven = true;

    MedianFinder() {

    }

    void addNum(int num) {
        if (isEven) {
            upper.push(num);
            lower.push(upper.top());
            upper.pop();

        } else {
            lower.push(num);
            upper.push(lower.top());
            lower.pop();
        }

        isEven = !isEven;
    }

    double findMedian() {
        if (isEven) {
            return (upper.top() + lower.top()) / 2.0;
        } else {
            return lower.top();
        }
    }
};