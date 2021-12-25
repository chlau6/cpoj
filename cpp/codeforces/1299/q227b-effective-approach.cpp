#include<bits/stdc++.h>

using namespace std;

int main() {
    int n, num;
    cin >> n;

    vector<int> v(100001);
    for (int i = 1; i <= n; i++) {
        cin >> num;
        v[num] = i;
    }

    int q;
    cin >> q;

    long long result1 = 0, result2 = 0;
    for (int i = 0; i < q; i++) {
        cin >> num;
        result1 += v[num];
        result2 += (n - v[num] + 1);
    }

    cout << result1 << " " << result2;
}