#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    int secondHighest(string s) {
        int largest = -1;
        int secondLargest = -1;

        for (char c : s) {
            if (c < '0' || c > '9') continue;

            int num = c - '0';

            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }

        return secondLargest;
    }
};