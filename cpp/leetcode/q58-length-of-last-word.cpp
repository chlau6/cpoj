#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    int lengthOfLastWord(string s) {
        int index = s.size() - 1;
        int length = 0;

        while (s[index] == ' ') index--;
        while (s[index] != ' ') {
            index--;
            length++;
        }

        return length;
    }
};