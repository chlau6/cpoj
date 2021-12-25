#include<bits/stdc++.h>

using namespace std;

int main() {
    int n, fingers, sum = 0;;
    cin >> n;

    for (int i = 0; i < n; i++) {
        cin >> fingers;
        sum += fingers;
    }

    int result = 0;
    for (int i = 1; i <= 5; i++) {
        if ((sum + i) % (n + 1) != 1) {
            result++;
        }
    }

    cout << result;
}