#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    int strongPasswordChecker(string s) {
        int n = s.size();

        int requiredChar = charTypeMiss(s);

        if (n < 6) {
            return max(requiredChar, 6 - n);
        }

        // only need replacement and deletion now when s.Length >= 6
        int replace = 0; // total replacements for repeated chars. e.g. "aaa" needs 1 replacement to fix
        int oneDeletion = 0; // total deletions for 3n repeated chars. e.g. "aaa" needs 1 deletion to fix
        int twoDeletion = 0; // total deletions for 3n+1 repeated chars. e.g. "aaaa" needs 2 deletions to fix.
        int i = 0;

        while (i < n) {
            int l = 1; // repeated len
            while (i + l < n && s[i + l] == s[i + l - 1]) {
                l++;
            }

            if (l >= 3) {
                replace += l / 3;
                if (l % 3 == 0) {
                    oneDeletion += 1;
                } else if (l % 3 == 1) {
                    twoDeletion += 2;
                }
            }

            i += l;
        }

        // no need deletion when s.Length <= 20
        if (n <= 20) return max(requiredChar, replace);

        int deleteCount = n - 20;

        // deleting 1 char in (3n) repeated chars will save one replacement
        replace -= min(deleteCount, oneDeletion);

        // deleting 2 chars in (3n+1) repeated chars will save one replacement
        replace -= min(max(deleteCount - oneDeletion, 0), twoDeletion) / 2;

        // deleting 3 chars in (3n+2) repeated chars will save one replacement
        replace -= max(deleteCount - oneDeletion - twoDeletion, 0) / 3;

        return deleteCount + max(requiredChar, replace);
    }

    int charTypeMiss(string s) {
        int lowercase = 1;
        int uppercase = 1;
        int digit = 1;

        for (char c : s) {
            if (islower(c)) {
                lowercase = 0;
            } else if (isupper(c)) {
                uppercase = 0;
            } else if (isdigit(c)) {
                digit = 0;
            }
        }

        return lowercase + uppercase + digit;
    }
};