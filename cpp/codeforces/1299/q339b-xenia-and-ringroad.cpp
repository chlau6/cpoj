#include<bits/stdc++.h>

using namespace std;

int main() {
    int n, m, a;
    cin >> n >> m;

    vector<int> v(n);

    int curr = 1;
    long long result = 0;
    for (int i = 0; i < m; i++) {
        cin >> a;

        result += (a >= curr ? a - curr : n - curr + a);
        curr = a;
    }

    cout << result;
}