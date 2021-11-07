#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    vector<int> arrayRankTransform(vector<int>& arr) {
        int length = arr.size();
        unordered_map<int, int> map;

        vector<int> a(arr);
        sort(a.begin(), a.end());

        for (int num : a) {
            map.emplace(num, map.size() + 1);
        }

        for (int i = 0; i < length; i++) {
            arr[i] = map[arr[i]];
        }

        return arr;
    }
};