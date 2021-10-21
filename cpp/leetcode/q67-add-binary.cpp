#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    string addBinary(string a, string b) {
        string result = "";
        int i = a.size() - 1;
        int j = b.size() - 1;
        int carry = 0;

        while (i >= 0 || j >= 0 || carry > 0) {
            int sum = carry;
            sum += i >= 0 ? a[i--] - '0' : 0;
            sum += j >= 0 ? b[j--] - '0' : 0;

            result = char(sum % 2 + '0') + result;
            carry = sum / 2;
        }

        return result;
    }
};