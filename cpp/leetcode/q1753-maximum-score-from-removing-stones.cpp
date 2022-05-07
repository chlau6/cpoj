#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    int maximumScore(int a, int b, int c) {
        priority_queue<int> pq;
        int result = 0;

        pq.push(a);
        pq.push(b);
        pq.push(c);

        while (pq.size() > 1) {
            int one = pq.top();
            pq.pop();

            int two = pq.top();
            pq.pop();

            if (--one > 0) {
                pq.push(one);
            }

            if (--two > 0) {
                pq.push(two);
            }

            result++;
        }

        return result;
    }
};