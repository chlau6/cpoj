#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    int daysBetweenDates(string date1, string date2) {
        return abs(daysSince1971(date1) - daysSince1971(date2));
    }

    int daysSince1971(string date) {
        vector<int> days = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int year = stoi(date.substr(0, 4));
        int month = stoi(date.substr(5, 2));
        int day = stoi(date.substr(8, 2));

        int total = 0;

        for (int i = 1971; i < year; i++) {
            total += isLeap(i) ? 366 : 365;
        }

        for (int i = 1; i < month; i++) {
            total += days[i];
        }

        if (isLeap(year) && month > 2) total += 1;

        return total + day;
    }

    bool isLeap(int year) {
        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
    }
};