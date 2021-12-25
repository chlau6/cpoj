#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    string intToRoman(int num) {
        vector<string> digits = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        vector<string> tens = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        vector<string> hundreds = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        vector<string> thousands = {"", "M", "MM", "MMM"};

        return thousands[num / 1000] + hundreds[num / 100 % 10] + tens[num / 10 % 10] + digits[num % 10];
    }
};