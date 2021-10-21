#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    string convertToTitle(int columnNumber) {
        string result = "";

        while (columnNumber > 0) {
            result = (char) (--columnNumber % 26 + 'A') + result;
            columnNumber /= 26;
        }

        return result;
    }
};