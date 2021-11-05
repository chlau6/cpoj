#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    vector<int> distributeCandies(int candies, int numPeople) {
        vector<int> result(numPeople);

        for (int i = 0; candies > 0; i++) {
            result[i % numPeople] += min(candies, i + 1);
            candies -= (i + 1);
        }

        return result;
    }
};