#include<bits/stdc++.h>

using namespace std;

int main() {
    int n;
    cin >> n;

    int sum = 0;
    int num = 0;
    for (int i = 0; i < n; i++) {
        cin >> num;
        sum += num;
    }

    cout << sum * 1.0 / n;
}