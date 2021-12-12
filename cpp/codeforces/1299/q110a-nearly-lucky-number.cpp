#include<bits/stdc++.h>

using namespace std;

int main() {
    long long num;
    cin >> num;

    int lucky = 0;

    while (num > 0) {
        int digit = num % 10;
        if (digit == 4 || digit == 7) {
            lucky++;
        }

        num /= 10;
    }

    cout << (lucky == 4 || lucky == 7 ? "YES" : "NO");
}