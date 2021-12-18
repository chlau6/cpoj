#include<bits/stdc++.h>

using namespace std;

int main() {
    string s;
    cin >> s;

    int size = s.size();
    int n = size / 2 + 1;

    for (int i = 0; i < n; i++) {
        for (int j = 2; j < size; j += 2) {
            if (s[j] < s[j - 2]) {
                swap(s[j], s[j - 2]);
            }
        }
    }

    cout << s;
}