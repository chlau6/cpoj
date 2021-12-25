#include<bits/stdc++.h>

using namespace std;

int main() {
    int n, p, sum = 0;
    cin >> n;

    vector<int> v(8);

    for (int i = 1; i <= 7; i++) {
        cin >> v[i];
        v[i] += v[i - 1];
    }

    n = (n - 1) % v[7] + 1;

    for (int i = 1; i <= 7; i++) {
        if (v[i] >= n) {
            cout << i;
            return 0;
        }
    }
}