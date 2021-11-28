#include<bits/stdc++.h>

using namespace std;

int main() {
    int count = 0;

    while (true) {
        int num;
        cin >> num;

        if (num == 1) break;
        count++;
    }

    cout << (abs(2 - count / 5) + abs(2 - count % 5));
}