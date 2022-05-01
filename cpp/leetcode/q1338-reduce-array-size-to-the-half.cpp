#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    int minSetSize(vector<int>& arr) {
        int n = arr.size();
        priority_queue<int> pq;

        sort(arr.begin(), arr.end());
        int result = 0;
        int count = 0;

        for (int i = 0; i < n;) {
            int j = i + 1;

            while (j < n && arr[i] == arr[j]) {
                j++;
            }

            pq.push(j - i);

            i = j;
        }

        while (count * 2 < n) {
            result++;
            count += pq.top();
            pq.pop();
        }

        return result;
    }
};