#include<bits/stdc++.h>

using namespace std;

int main() {
    int n;
    cin >> n;

    int left = 0;
    int right = 0;

    for (int i = 0; i < n; i++) {
        int l, r;
        cin >> l >> r;

        if (l == 1) left++;
        if (r == 1) right++;
    }

    cout << min(left, n - left) + min(right, n - right);
}