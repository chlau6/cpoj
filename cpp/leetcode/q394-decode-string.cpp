#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    string decodeString(string s) {
        queue<char> queue;

        for (auto& c : s) {
            queue.push(c);
        }

        return helper(queue);
    }

    string helper(queue<char>& queue) {
        string s;
        int num = 0;

        while (!queue.empty()) {
            char c = queue.front();
            queue.pop();

            if (c == '[') {
                string inner = helper(queue);

                for (int i = 0; i < num; i++) {
                    s += inner;
                }

                num = 0;
            } else if (c == ']') {
                break;
            } else if (isdigit(c)) {
                num = num * 10 + c - '0';
            } else {
                s += c;
            }
        }

        return s;
    }
};