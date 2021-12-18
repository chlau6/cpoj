#include<bits/stdc++.h>

using namespace std;

int main() {
    int line;
    cin >> line;

    int x = 0, y = 0, z = 0;
    int a, b, c;

    for (int i = 0; i < line; i++) {
        cin >> a >> b >> c;

        x += a;
        y += b;
        z += c;
    }

    cout << (x == 0 && y == 0 && z == 0 ? "YES" : "NO");
}