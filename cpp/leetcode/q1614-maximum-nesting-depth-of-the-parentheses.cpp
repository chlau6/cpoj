#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    int maxDepth(string s) {
        int count = 0;
        int result = 0;

        for (char c : s) {
            if (c == '(') result = max(result, ++count);
            else if (c == ')') count--;
        }

        return result;
    }
};