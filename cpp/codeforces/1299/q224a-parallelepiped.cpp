#include<bits/stdc++.h>

using namespace std;

int main() {
    int a, b, c;
    cin >> a >> b >> c;

    int x = sqrt(a * b / c);
    int y = sqrt(b * c / a);
    int z = sqrt(a * c / b);

    cout << (x + y + z) * 3;
}