#include<bits/stdc++.h>

using namespace std;

int main() {
    int k;
    string s;
    cin >> k >> s;

    vector<int> v(26);
    for (char c : s) {
        v[c - 'a']++;
    }

    string unit, result;
    for (int i = 0; i < 26; i++) {
        if (v[i] % k != 0) {
            cout << "-1";
            return 0;
        }

        unit += string(v[i] / k, (char) i + 'a');

    }

    for (int i = 0; i < k; i++) {
        result += unit;
    }

    cout << result;
}