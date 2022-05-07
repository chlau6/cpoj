#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    int halveArray(vector<int>& nums) {
        priority_queue<double> pq;
        double sum = 0;
        int result = 0;

        for (double num : nums) {
            pq.push(num);
            sum += num;
        }

        double originalSum = sum;

        while (sum * 2 > originalSum) {
            double half = pq.top() / 2;
            pq.pop();

            sum -= half;
            pq.push(half);

            result++;
        }

        return result;
    }
};