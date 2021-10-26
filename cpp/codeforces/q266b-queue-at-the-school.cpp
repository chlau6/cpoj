#include<bits/stdc++.h>

using namespace std;

int main() {
    int n, t;
    string queue;
    cin >> n >> t >> queue;

    int length = queue.size();

    for (int i = 0; i < t; i++) {
        bool isChanged = false;

        for (int j = 0; j < queue.size() - 1; j++) {
            if (queue[j] == 'B' && queue[j + 1] == 'G') {
                queue[j] = 'G';
                queue[j + 1] = 'B';
                j++;
                isChanged = true;
            }
        }

        if (!isChanged) break;
    }

    cout << queue;
}