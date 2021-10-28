#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    string toGoatLatin(string sentence) {
        string result = "";
        string a = "a";
        string token = "";

        istringstream iss(sentence);

        while (iss >> token) {
            char c = tolower(token[0]);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                result += token;
            } else {
                result += token.substr(1) + token.substr(0, 1);
            }

            result += "ma" + a + " ";
            a += "a";
        }

        return result.substr(0, result.size() - 1);
    }
};