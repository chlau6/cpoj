#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    vector<int> diffWaysToCompute(string expression) {
        unordered_map<string, vector<int>> map;

        return helper(map, expression);
    }

    vector<int> helper(unordered_map<string, vector<int>>& map, string expression) {
        if (map.count(expression)) return map[expression];

        vector<int> result;
        int n = expression.size();

        for (int i = 0; i < n; i++) {
            if (expression[i] == '+' || expression[i] == '-' || expression[i] == '*') {
                vector<int> left = helper(map, expression.substr(0, i));
                vector<int> right = helper(map, expression.substr(i + 1));

                int l = left.size();
                int r = right.size();

                for (int j = 0; j < l; j++) {
                    for (int k = 0; k < r; k++) {
                        if (expression[i] == '+') {
                            result.push_back(left[j] + right[k]);
                        } else if (expression[i] == '-') {
                            result.push_back(left[j] - right[k]);
                        } else {
                            result.push_back(left[j] * right[k]);
                        }
                    }
                }
            }
        }

        if (result.empty()) {
            result.push_back(stoi(expression));
        }

        map[expression] = result;

        return result;
    }
};