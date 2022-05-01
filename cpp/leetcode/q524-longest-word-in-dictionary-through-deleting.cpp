#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    string findLongestWord(string s, vector<string>& dictionary) {
        sort(dictionary.begin(), dictionary.end(), [](string a, string b) {
            return a.length() == b.length() ? a < b : a.size() > b.size();
        });

        for (auto str : dictionary) {
            int i = 0;
            int n = str.size();

            for (char c : s) {
                if (str[i] == c) {
                    i++;
                }

                if (i == n) return str;
            }
        }

        return "";
    }
};