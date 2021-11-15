#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    int minOperations(vector<string>& logs) {
        int count = 0;

        for (string log : logs) {
            if (log == "../") {
                count = max(--count, 0);
            } else if (log != "./") {
                count++;
            }
        }

        return count;
    }
};