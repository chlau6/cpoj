#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    int numJewelsInStones(string jewels, string stones) {
        unordered_set<char> set;
        int count = 0;

        for (char c : jewels) {
            set.insert(c);
        }

        for (char c : stones) {
            if (set.count(c)) count++;
        }

        return count;
    }
};