#include<bits/stdc++.h>

using namespace std;

int main() {
    int n;
    string stones;
    cin >> n >> stones;

    int i = 1;
    int result = 0;

    for (int i = 1; i < n; i++) {
        if (stones[i] == stones[i - 1]) {
            result++;
        }
    }

    cout << result;
}