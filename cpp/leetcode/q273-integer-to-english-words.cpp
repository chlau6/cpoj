#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    vector<string> lessThanTwenty = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
    vector<string> tens = {"", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};

    string numberToWords(int num) {
        if (num == 0) return "Zero";

        return helper(num).substr(1);
    }

    string helper(int num) {
        if (num >= 1000000000) {
            return helper(num / 1000000000) + " Billion" + helper(num % 1000000000);
        } else if (num >= 1000000) {
            return helper(num / 1000000) + " Million" + helper(num % 1000000);
        } else if (num >= 1000) {
            return helper(num / 1000) + " Thousand" + helper(num % 1000);
        } else if (num >= 100) {
            return helper(num / 100) + " Hundred" + helper(num % 100);
        } else if (num >= 20) {
            return " " + tens[num / 10] + helper(num % 10);
        } else if (num >= 1) {
            return " " + lessThanTwenty[num];
        }

        return "";
    }
};