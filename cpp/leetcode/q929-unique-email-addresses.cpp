#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    int numUniqueEmails(vector<string>& emails) {
        unordered_set<string> set;

        for (string email : emails) {
            auto atPos = email.find("@");
            int length = email.size();

            string result = "";

            for (auto c : email) {
                if (c == '+' || c == '@') break;
                else if (isalpha(c)) result.push_back(c);
            }

            set.insert(result + email.substr(atPos, length - atPos));
        }

        return set.size();
    }
};