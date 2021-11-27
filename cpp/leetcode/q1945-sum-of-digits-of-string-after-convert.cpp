#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    int getLucky(string s, int k) {
        int result = 0;
        int temp = 0;

        for (char c : s) {
            int num = c - 'a' + 1;
            result += num / 10 + num % 10;
        }

        while (--k > 0) {
            while (result > 0) {
                temp += result % 10;
                result /= 10;
            }

            result = temp;
            temp = 0;
        }

        return result;
    }
};