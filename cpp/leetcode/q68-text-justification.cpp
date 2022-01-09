#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    vector<string> fullJustify(vector<string>& words, int maxWidth) {
        vector<string> result;

        int n = words.size();
        int i = 0;
        int j = 0;

        while (i < n) {
            int len = 0;

            while (j < words.size() && len + words[j].size() + j - i <= maxWidth) {
                len += words[j++].size();
            }

            string lines = words[i];

            int space = 1;
            int extra = 0;

            if (j != i + 1 && j != n) {
                space = (maxWidth - len) / (j - i - 1);
                extra = (maxWidth - len) % (j - i - 1);
            }

            string spaceStr = string(space, ' ');

            for (int k = i + 1; k < j; k++) {
                lines += spaceStr;
                if (extra-- > 0) lines += ' ';
                lines += words[k];
            }

            int lastLineSpace = maxWidth - lines.size();
            lines += string(lastLineSpace, ' ');
            result.push_back(lines);

            i = j;
        }

        return result;
    }
};