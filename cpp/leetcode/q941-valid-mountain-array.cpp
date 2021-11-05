#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    bool validMountainArray(vector<int>& arr) {
        int length = arr.size();
        int i = 0;
        int j = length - 1;

        while (i < length - 1 && arr[i] < arr[i + 1]) i++;
        while (j > 0 && arr[j] < arr[j - 1]) j--;

        return i > 0 && j < length - 1 && i == j;
    }
};