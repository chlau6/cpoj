#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    vector<string> findRepeatedDnaSequences(string s) {
        unordered_set<string> result;
        unordered_set<string> sequence;
        int n = s.size();

        for (int i = 0; i <= n - 10; i++) {
            string seq = s.substr(i, 10);

            if (sequence.count(seq)) {
                result.insert(seq);
            } else {
                sequence.insert(seq);
            }
        }

        return vector<string>(result.begin(), result.end());
    }
};
