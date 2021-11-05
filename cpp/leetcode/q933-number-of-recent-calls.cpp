#include<bits/stdc++.h>

using namespace std;

class RecentCounter {
public:
    queue<int> q;

    RecentCounter() {

    }

    int ping(int t) {
        q.push(t);

        int last = t - 3000;

        while (q.front() < last) {
            q.pop();
        }

        return q.size();
    }
};