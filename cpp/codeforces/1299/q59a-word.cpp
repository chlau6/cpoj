#include<bits/stdc++.h>

using namespace std;

int main() {
    string word;
    cin >> word;

    int upper = 0;
    int n = word.size();

    for (char c : word) {
        if (c <= 92) upper++;
    }

    if (2 * upper > n) {
        transform(word.begin(), word.end(), word.begin(), ::toupper);
    } else {
        transform(word.begin(), word.end(), word.begin(), ::tolower);
    }

    cout << word;
}