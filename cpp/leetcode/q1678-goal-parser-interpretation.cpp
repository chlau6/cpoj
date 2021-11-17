#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    string interpret(string command) {
        int n = command.size();
        int i = 0;
        string result;

        while (i < n) {
            if (command[i] == 'G') {
                result += 'G';
                i++;
            } else if (command[i] == '(' && command[i + 1] == ')') {
                result += 'o';
                i += 2;
            } else {
                result += "al";
                i += 4;
            }
        }

        return result;
    }
};