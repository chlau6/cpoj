#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    vector<int> relativeSortArray(vector<int>& arr1, vector<int>& arr2) {
        vector<int> counts(1001);

        for (int num : arr1) {
            counts[num]++;
        }

        int i = 0;

        for (int num : arr2) {
            while (--counts[num] >= 0) {
                arr1[i++] = num;
            }
        }

        for (int j = 0; j < 1001; j++) {
            while (--counts[j] >= 0) {
                arr1[i++] = j;
            }
        }

        return arr1;
    }
};