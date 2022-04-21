#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    int getMaxRepetitions(string s1, int n1, string s2, int n2) {
        unordered_map<int, int> kToRepeatCount;
        unordered_map<int, int> nextIndexToK;
        kToRepeatCount[0] = 0;
        nextIndexToK[0] = 0;

        int j = 0;
        int count = 0;
        int m = s1.size();
        int n = s2.size();

        for (int k = 1; k <= n1; k++) {
            for (int i = 0; i < m; i++) {
                if (s1[i] == s2[j]) {
                    j++;

                    if (j == n) {
                        j = 0;
                        count++;
                    }
                }
            }

            if (nextIndexToK.count(j)) {
                int start = nextIndexToK[j];
                int prefixCount = kToRepeatCount[start];
                int patternCount = (n1 - start) / (k - start) * (count - prefixCount);
                int suffixCount = kToRepeatCount[start + (n1 - start) % (k - start)] - prefixCount;
                return (prefixCount + patternCount + suffixCount) / n2;
            }

            kToRepeatCount[k] = count;
            nextIndexToK[j] = k;
        }

        return kToRepeatCount[n1] / n2;
    }
};