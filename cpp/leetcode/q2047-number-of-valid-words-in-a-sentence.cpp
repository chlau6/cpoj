#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    int countValidWords(string sentence) {
        int result = 0;
        string token;
        istringstream iss(sentence);

        while (iss >> token) {
            if (isValid(token)) {
                result++;
            }
        }

        return result;
    }

    bool isValid(string s) {
        int hyphen = 0;
        int n = s.size();

        for (int i = 0; i < n; i++) {
            if (isdigit(s[i])) return false;

            if (isalpha(s[i])) continue;

            if (s[i] == '-') {
                if (++hyphen > 1) return false;

                if (i - 1 < 0 || !isalpha(s[i - 1]) || i + 1 == n || !isalpha(s[i + 1])) return false;

            } else if (i != n - 1) return false;
        }

        return true;
    }
};