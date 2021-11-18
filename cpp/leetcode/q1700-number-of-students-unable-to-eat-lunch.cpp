#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    int countStudents(vector<int>& students, vector<int>& sandwiches) {
        vector<int> counts(2);

        for (int student : students) {
            counts[student]++;
        }

        int n = sandwiches.size();
        int i;

        for (i = 0; i < n; i++) {
            if (counts[sandwiches[i]] <= 0) {
                break;
            }
            counts[sandwiches[i]]--;
        }

        return n - i;
    }
};