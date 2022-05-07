#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    vector<int> deckRevealedIncreasing(vector<int>& deck) {
        int n = deck.size();
        vector<int> result(n);
        queue<int> q;

        sort(deck.begin(), deck.end());

        for (int i = 0; i < n; i++) {
            q.push(i);
        }

        for (int i = 0; i < n; i++) {
            result[q.front()] = deck[i];
            q.pop();

            q.push(q.front());
            q.pop();
        }

        return result;
    }
};