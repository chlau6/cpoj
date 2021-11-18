#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    string reformatNumber(string number) {
        string filter;
        string result;

        for (char c : number) {
            if (c != '-' && c != ' ') {
                filter += c;
            }
        }

        int i = 0;
        int n = filter.size();

        while (i < n) {
            int j = (n - i == 2 || n - i == 4) ? 2 : 3;

            result += filter.substr(i, j);
            i += j;

            if (i != n) {
                result += '-';
            }
        }

        return result;
    }
};