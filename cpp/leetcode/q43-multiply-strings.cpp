#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    string multiply(string num1, string num2) {
        int m = num1.size();
        int n = num2.size();
        vector<int> digits(m + n);

        for (int i = m - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {
                int multiple = (num1[i] - '0') * (num2[j] - '0');
                int p1 = i + j;
                int p2 = i + j + 1;
                int sum = multiple + digits[p2];

                digits[p2] = sum % 10;
                digits[p1] += sum / 10;
            }
        }

        string result;

        for (int d : digits) {
            if (result.size() > 0 || d > 0) {
                result += to_string(d);
            }
        }

        return result.size() == 0 ? "0" : result;
    }
};