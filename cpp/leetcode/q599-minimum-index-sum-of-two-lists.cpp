#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    vector<string> findRestaurant(vector<string>& list1, vector<string>& list2) {
        unordered_map<string, int> map;
        vector<string> result;
        int minimum = INT_MAX;
        int length2 = list2.size();
        int length1 = list1.size();

        for (int i = 0; i < length2; i++) {
            map[list2[i]] = i;
        }

        for (int i = 0; i < length1; i++) {
            if (map.count(list1[i])) {
                int sum = map[list1[i]] + i;

                if (sum <= minimum) {
                    if (sum < minimum) result.clear();
                    result.push_back(list1[i]);
                    minimum = sum;
                }
            }
        }

        return result;
    }
};