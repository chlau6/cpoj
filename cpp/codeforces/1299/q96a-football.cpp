#include<bits/stdc++.h>

using namespace std;

int main() {
    string s;
    cin >> s;

    int p = 1;
    int n = s.size();
    for (int i = 1; i < n; i++) {
        if (s[i] == s[i - 1]) {
            p++;
        } else {
            p = 1;
        }

        if (p == 7) {
            cout << "YES";
            return 0;
        }
    }

    cout << "NO";
}
