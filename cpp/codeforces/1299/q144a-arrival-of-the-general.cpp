#include<bits/stdc++.h>

using namespace std;

int main() {
    int n;
    cin >> n;

    int num = 0;
    int maxValue = INT_MIN;
    int minValue = INT_MAX;
    int maxIndex = 0;
    int minIndex = 0;

    for (int i = 0; i < n; i++) {
        cin >> num;
        if (num > maxValue) {
            maxValue = num;
            maxIndex = i;
        }

        if (num <= minValue) {
            minValue = num;
            minIndex = i;
        }
    }

    int moves = maxIndex + n - minIndex - 1;
    cout << (maxIndex > minIndex ? moves - 1 : moves);
}