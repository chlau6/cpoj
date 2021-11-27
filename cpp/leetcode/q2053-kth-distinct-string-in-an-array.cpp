#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    string kthDistinct(vector<string>& arr, int k) {
        unordered_map<string, int> map;

        for (string s : arr) {
            map[s]++;
        }

        for (string s : arr) {
            if (map[s] == 1 && --k == 0) {
                return s;
            }
        }

        return "";
    }
};