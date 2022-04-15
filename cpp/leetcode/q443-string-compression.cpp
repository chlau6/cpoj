#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    int compress(vector<char>& chars) {
        int n = chars.size();

        int index = 0;
        int i = 0;
        int j = 0;

        while (i < n) {
            while (j < n && chars[j] == chars[i]) {
                j++;
            }

            chars[index++] = chars[i];

            if (j - i > 1) {
                for (char c : to_string(j - i)) {
                    chars[index++] = c;
                }
            }

            i = j;
        }

        return index;
    }
};