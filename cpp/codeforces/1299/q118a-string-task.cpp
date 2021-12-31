#include<bits/stdc++.h>

using namespace std;

int main() {
    string s, result;
    cin >> s;

    for (char c : s) {
        c = tolower(c);

        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'y') continue;

        result += '.';
        result += c;
    }

    cout << result;
}
