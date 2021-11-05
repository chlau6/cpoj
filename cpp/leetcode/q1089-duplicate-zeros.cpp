#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    void duplicateZeros(vector<int>& arr) {
        int zeros = 0;

        for (int num : arr) {
            if (num == 0) zeros++;
        }

        int length = arr.size();

        int i = length - 1;
        int j = length + zeros - 1;

        while (i < j) {
            if (arr[i] != 0) {
                if (j < length) arr[j] = arr[i];
            } else {
                if (j < length) arr[j] = arr[i];
                j--;
                if (j < length) arr[j] = arr[i];
            }

            i--;
            j--;
        }
    }
};