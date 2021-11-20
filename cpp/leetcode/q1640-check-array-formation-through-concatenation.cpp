#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    bool canFormArray(vector<int>& arr, vector<vector<int>>& pieces) {
        unordered_map<int, vector<int>> map;

        for (auto& piece : pieces) {
            map[piece[0]] = piece;
        }

        int n = arr.size();
        int i = 0;

        while (i < n) {
            if (!map.count(arr[i])) return false;

            auto piece = map[arr[i]];

            for (auto num : piece) {
                if (num != arr[i]) return false;

                i++;
            }
        }

        return true;
    }
};