#include<bits/stdc++.h>

using namespace std;

int main() {
    string s;
    cin >> s;

    vector<int> v(26);
    int result = 0;

    for (char c : s) {
        if (++v[c - 'a'] == 1) {
            result++;
        }
    }

    if (result % 2 == 0) {
        cout << "CHAT WITH HER!";
    } else {
        cout << "IGNORE HIM!";
    }
}