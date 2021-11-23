#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    bool isSumEqual(string firstWord, string secondWord, string targetWord) {
        int firstSum = 0;
        int secondSum = 0;
        int targetSum = 0;

        for (auto c : firstWord) {
            firstSum = firstSum * 10 + c - 'a';
        }

        for (auto c : secondWord) {
            secondSum = secondSum * 10 + c - 'a';
        }

        for (auto c : targetWord) {
            targetSum = targetSum * 10 + c - 'a';
        }

        return firstSum + secondSum == targetSum;
    }
};