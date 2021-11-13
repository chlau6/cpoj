#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    int countGoodTriplets(vector<int>& arr, int a, int b, int c) {
        int result = 0;
        int length = arr.size();

        for (int i = 0; i < length - 2; i++) {
            for (int j = i + 1; j < length - 1; j++) {
                if (abs(arr[i] - arr[j]) > a) continue;

                for (int k = j + 1; k < length; k++) {
                    if (abs(arr[j] - arr[k]) <= b && abs(arr[i] - arr[k]) <= c) {
                        result++;
                    }
                }
            }
        }

        return result;
    }
};