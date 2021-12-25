#include<bits/stdc++.h>

using namespace std;

int main() {
    int n, m, a;
    cin >> n >> m;

    int round = 0;
    int result = 0;
    for (int i = 1; i <= n; i++) {
        cin >> a;

        int t = (a % m != 0) ? a / m + 1 : a / m;
        if (t >= round) {
            round = t;
            result = i;
        }
    }

    cout << result;
}