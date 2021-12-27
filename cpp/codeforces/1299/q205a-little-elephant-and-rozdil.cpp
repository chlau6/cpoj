#include<bits/stdc++.h>

using namespace std;

int main() {
    int n, num;
    cin >> n;

    int minDist = INT_MAX;
    int minIndex = 0;
    int count = 0;

    for (int i = 1; i <= n; i++) {
        cin >> num;

        if (num < minDist) {
            minDist = num;
            minIndex = i;
            count = 1;
        } else if (num == minDist) {
            count++;
        }
    }

    cout << (count == 1 ? to_string(minIndex) : "Still Rozdil");
}