#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    int uniqueMorseRepresentations(vector<string>& words) {
        vector<string> code {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};

        unordered_set<string> set;

        for (auto word : words) {
            string result = "";

            for (auto c : word) {
                result += code[c - 'a'];
            }

            set.insert(result);
        }

        return set.size();
    }
};