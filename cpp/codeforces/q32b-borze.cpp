#include<bits/stdc++.h>

using namespace std;

int main() {
    string s;
    cin >> s;

    int n = s.size();
    string result;

    for (int i = 0; i < n; i++) {
        if (s[i] == '.') {
            result += '0';
        } else {
            result += (s[i + 1] == '.') ? '1' : '2';
            i++;
        }
    }

    cout << result;
}