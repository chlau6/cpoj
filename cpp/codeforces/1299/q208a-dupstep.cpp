#include<bits/stdc++.h>

using namespace std;

int main() {
    string result, s;
    cin >> s;

    int n = s.size();
    int i = 0;
    while (i < n) {
        if (i + 2 < n && s[i] == 'W' && s[i + 1] == 'U' && s[i + 2] == 'B') {
            i += 3;

            if (result.size() > 0 && result.back() != ' ') {
                result += ' ';
            }
        } else {
            result += s[i++];
        }
    }

    cout << result;
}
