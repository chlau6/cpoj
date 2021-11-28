#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    int countVowelSubstrings(string word) {
        unordered_map<char, int> map = {{'a', 0}, {'e', 0}, {'i', 0}, {'o', 0}, {'u', 0}};

        int result = 0;
        int vowel = 0;
        int i = 0;
        int j = 0;
        int n = word.size();

        for (int k = 0; k < n; k++) {
            if (map.count(word[k])) {
                if (++map[word[k]] == 1) {
                    vowel++;
                }

                while (vowel == 5) {
                    if (--map[word[j++]] == 0) {
                        vowel--;
                    }
                }

                result += j - i;
            } else {
                map['a'] = map['e'] = map['i'] = map['o'] = map['u'] = vowel = 0;
                i = j = k + 1;
            }
        }

        return result;
    }
};