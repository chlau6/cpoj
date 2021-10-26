#include<bits/stdc++.h>

using namespace std;

int main() {
    int vectorNum;
    cin >> vectorNum;

    int xSum = 0, ySum = 0, zSum = 0;
    for (int i = 0; i < vectorNum; i++) {
        int x, y, z;
        cin >> x >> y >> z;

        xSum += x;
        ySum += y;
        zSum += z;
    }

    cout << (xSum == 0 && ySum == 0 && zSum == 0) ? "YES" :"NO" ;
}