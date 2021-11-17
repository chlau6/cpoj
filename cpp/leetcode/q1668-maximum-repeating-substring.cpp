#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    int maxRepeating(string sequence, string word) {
        int result = 1;
        string temp = word;

        while (sequence.find(temp) != string::npos) {
            result++;
            temp += word;
        }

        return result - 1;
    }
};