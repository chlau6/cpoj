#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    vector<int> replaceElements(vector<int>& arr) {
        int greatest = -1;
        int length = arr.size();

        for (int i = length - 1; i >= 0; i--) {
            int temp = arr[i];
            arr[i] = greatest;
            greatest = max(greatest, temp);
        }

        return arr;
    }
};