#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    int countSegments(string s) {
        int count = 0;
        int length = s.size() - 1;

        for (int i = 0; i < length; i++) {
            if (s[i] == ' ') continue;

            count++;

            while (i < length && s[i] != ' ') i++;
        }

        return count;
    }
};