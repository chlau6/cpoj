#include<bits/stdc++.h>

using namespace std;

int main() {
    int n;
    cin >> n;

    int currentPassenger = 0;
    int maximumPassenger = 0;

    for (int i = 0; i < n; i++) {
        int enter, exit;
        cin >> exit >> enter;

        currentPassenger = currentPassenger - exit + enter;
        maximumPassenger = max(maximumPassenger, currentPassenger);
    }

    cout << maximumPassenger;
}