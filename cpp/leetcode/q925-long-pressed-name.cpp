#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    bool isLongPressedName(string name, string typed) {
        int i = 0;
        int nLength = name.size();
        int tLength = typed.size();

        for (int j = 0; j < tLength; j++) {
            if (i < nLength && name[i] == typed[j]) i++;
            else if (j == 0 || typed[j] != typed[j - 1]) return false;
        }

        return i == nLength;
    }
};