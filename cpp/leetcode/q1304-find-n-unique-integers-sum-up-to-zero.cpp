#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    vector<int> sumZero(int n) {
        vector<int> result(n);

        int left = 0;
        int right = n - 1;
        int num = 1;

        while (left < right) {
            result[left++] = num;
            result[right--] = -num;
            num++;
        }

        return result;
    }
};