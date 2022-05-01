#include<bits/stdc++.h>

using namespace std;

class StockSpanner {
public:
    stack<pair<int, int>> stack;

    StockSpanner() {

    }

    int next(int price) {
        int result = 1;

        while (!stack.empty() && price >= stack.top().first) {
            auto& last = stack.top();
            stack.pop();

            result += last.second;
        }

        stack.push({price, result});

        return result;
    }
};