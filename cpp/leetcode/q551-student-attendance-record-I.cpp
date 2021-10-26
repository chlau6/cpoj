#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    bool checkRecord(string s) {
        int absent = 0;
        int late = 0;
        int length = s.size();

        for (int i = 0; i < length; i++) {
            if (s[i] == 'A') {
                if (++absent > 1) return false;
                late = 0;
            } else if (s[i] == 'L') {
                if (++late > 2) return false;
            } else {
                late = 0;
            }
        }

        return true;
    }
};