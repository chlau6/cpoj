#include<bits/stdc++.h>

using namespace std;

int main() {
    int n, h;
    cin >> n;

    vector<int> v;

    for (int i = 0; i < n; i++) {
        cin >> h;
        v.push_back(h);
    }

    int index1 = 1, index2 = n, minDiff = abs(v[0] - v[n - 1]);
    for (int i = 0; i < n - 1; i++) {
        int diff = abs(v[i] - v[i + 1]);
        if (diff < minDiff) {
            minDiff = diff;
            index1 = i + 1;
            index2 = i + 2;
        }
    }

    cout << index1 << " " << index2;
}