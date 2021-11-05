#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    int dayOfYear(string date) {
        vector<int> days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int year = stoi(date.substr(0, 4));
        int month = stoi(date.substr(5, 2));
        int day = stoi(date.substr(8, 2));

        if (isLeap(year)) {
            days[1]++;
        }

        int result = 0;

        for (int i = 0; i < month - 1; i++) {
            result += days[i];
        }

        return result + day;
    }

    bool isLeap(int year) {
        return year % 400 == 0 || year % 4 == 0 && year % 100 != 0;
    }
};