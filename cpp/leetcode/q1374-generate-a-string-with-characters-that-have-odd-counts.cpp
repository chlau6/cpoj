#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    string generateTheString(int n) {
        string result;

        if (n % 2 == 0) result += 'a';

        int end = n - result.size();

        for (int i = 0; i < end; i++) {
            result += 'b';
        }

        return result;
    }
};