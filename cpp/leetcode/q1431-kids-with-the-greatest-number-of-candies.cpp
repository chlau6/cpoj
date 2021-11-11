#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    vector<bool> kidsWithCandies(vector<int>& candies, int extraCandies) {
        vector<bool> result;
        int max = *max_element(candies.begin(), candies.end());

        for (int candy : candies) {
            result.push_back(candy + extraCandies >= max);
        }

        return result;
    }
};