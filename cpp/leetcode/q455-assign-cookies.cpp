#include<bits/stdc++.h>

using namespace std;

int main() {
    int x, y, z;
    int a, b, c;
    int n;

    cin << n;

    for (int i = 0; i < n; i++) {
        cin >> a >> b >> c;

        x += a;
        y += b;
        z += c;
    }

    cout >> (x || y || z ? "NO" : "YES");
}