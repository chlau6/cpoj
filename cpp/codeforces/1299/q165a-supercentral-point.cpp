#include<bits/stdc++.h>

using namespace std;

int main() {
    int n;
    cin >> n;

    vector<int> x(n);
    vector<int> y(n);
    for (int i = 0; i < n; i++) {
        cin >> x[i];
        cin >> y[i];
    }

    int result = 0;
    for (int i = 0; i < n; i++) {
        bool left = false;
        bool right = false;
        bool lower = false;
        bool upper = false;

        for (int j = 0; j < n; j++) {
            if (j == i) continue;

            if (x[j] < x[i] && y[j] == y[i]) left = true;
            if (x[j] > x[i] && y[j] == y[i]) right = true;
            if (x[j] == x[i] && y[j] < y[i]) lower = true;
            if (x[j] == x[i] && y[j] > y[i]) upper = true;
        }

        if (left && right && lower && upper) result++;
    }

    cout << result;
}