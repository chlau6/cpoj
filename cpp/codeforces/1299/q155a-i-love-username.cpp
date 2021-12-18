#include<bits/stdc++.h>

using namespace std;

int main() {
    int n, s;
    cin >> n >> s;

    int minVal = s;
    int maxVal = s;
    int result = 0;

    for (int i = 1; i < n; i++) {
        cin >> s;

        if (s < min) {
            result++;
            min = s;
        }

        if (s > max) {
            result++;
            max = s;
        }
    }

    cout << result;
}