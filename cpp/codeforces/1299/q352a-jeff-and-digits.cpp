#include<bits/stdc++.h>

using namespace std;

int main() {
    int n, d, z = 0, f = 0;
    cin >> n;

    for (int i = 0; i < n; i++) {
        cin >> d;
        if (d == 5) {
            f++;
        } else {
            z++;
        }
    }

    if (z == 0) {
        cout << -1;
    } else if (f < 9) {
        cout << 0;
    } else {
        f = f / 9 * 9;

        for (int i = 0; i < f; i++) {
            cout << 5;
        }

        for (int i = 0; i < z; i++) {
            cout << 0;
        }
    }
}