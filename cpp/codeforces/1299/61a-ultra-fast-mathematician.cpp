#include<bits/stdc++.h>

using namespace std;

int main() {
    string s1, s2;
    cin >> s1 >> s2;

    string result;
    int n = s1.size();

    for (int i = 0; i < n; i++) {
        result += (s1[i] == s2[i] ? '0' : '1');
    }

    cout << result;
}
