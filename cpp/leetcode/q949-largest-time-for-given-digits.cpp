#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    string largestTimeFromDigits(vector<int>& arr) {
        int n = arr.size();
        string result = "";

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    if (i == j || i == k || j == k) continue;

                    string hour = to_string(arr[i]) + "" + to_string(arr[j]);
                    string min = to_string(arr[k]) + "" + to_string(arr[6 - i - j - k]);

                    if (hour > "23" || min > "59") continue;

                    string temp = hour + ":" + min;

                    if (temp > result) {
                        result = temp;
                    }
                }
            }
        }

        return result;
    }
};