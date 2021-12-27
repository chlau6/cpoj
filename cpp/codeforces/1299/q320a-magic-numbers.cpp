#include<bits/stdc++.h>

using namespace std;

int main() {
    string s;
    cin >> s;

    int n = s.size();
    int i = 0;

    while (i < n) {
        if (i + 2 < n && s[i] == '1' && s[i + 1] == '4' && s[i + 2] == '4') {
            i += 3;
        } else if (i + 1 < n && s[i] == '1' && s[i + 1] == '4') {
            i += 2;
        } else if (s[i] == '1') {
            i++;
        } else {
            cout << "NO";
            return 0;
        }
    }

    cout << "YES";
}
