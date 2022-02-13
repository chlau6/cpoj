#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    string reverseWords(string s) {
        int n = s.size();

        reverse(s, 0, n - 1);
        reverseWords(s, n);
        return helper(s, n);
    }

    void reverse(string& s, int i, int j) {
        while (i < j) {
            char c = s[i];
            s[i++] = s[j];
            s[j--] = c;
        }
    }

    void reverseWords(string& s, int n) {
        int i = 0;

        while (i < n) {
            while (i < n && s[i] == ' ') i++;
            int j = i;

            while (j < n && s[j] != ' ') j++;
            reverse(s, i, j - 1);
            i = j;
        }
    }

    string helper(string& s, int n) {
        int i = 0;
        int j = 0;

        while (i < n) {
            while (i < n && s[i] == ' ') i++;
            while (i < n && s[i] != ' ') s[j++] = s[i++];
            while (i < n && s[i] == ' ') i++;
            if (i < n) s[j++] = ' ';
        }

        return s.substr(0, j);
    }
};