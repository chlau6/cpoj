#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    vector<int> rearrangeBarcodes(vector<int>& barcodes) {
        int n = barcodes.size();
        unordered_map<int, int> map;
        vector<pair<int, int>> v;
        vector<int> result(n);

        for (int barcode : barcodes) {
            map[barcode]++;
        }

        for (auto& entry : map) {
            v.push_back({entry.second, entry.first});
        }

        sort(v.rbegin(), v.rend());

        int pos = 0;
        for (auto& a : v) {
            int times = a.first;

            for (int i = 0; i < times; i++) {
                result[pos] = a.second;
                pos += 2;

                if (pos >= n) pos = 1;
            }
        }

        return result;
    }
};