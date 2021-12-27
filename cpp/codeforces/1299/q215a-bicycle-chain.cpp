#include<bits/stdc++.h>

using namespace std;

int main() {
    int n, s;
    cin >> n;

    vector<int> v;
    for (int i = 0; i < n; i++) {
        cin >> s;
        v.push_back(s);
    }

    int maxRatio = INT_MIN;
    int count = 0;
    cin >> n;
    for (int i = 0; i < n; i++) {
        cin >> s;

        for (int a : v) {
            if (s % a == 0) {
                int ratio = s / a;
                if (ratio > maxRatio) {
                    maxRatio = ratio;
                    count = 1;
                } else if (ratio == maxRatio) {
                    count++;
                }
            }
        }
    }

    cout << count;
}
