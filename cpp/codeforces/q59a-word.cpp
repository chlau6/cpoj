#include<bits/stdc++.h>

using namespace std;

int main() {
    string word;
    cin >> word;

    int length = word.size();
    int upper = 0;
    for (int i = 0; i < length; i++) {
        if (word[i] >= 65 && word[i] <= 90) {
            upper++;
        }
    }

    if (2 * upper > length) {
        transform(word.begin(), word.end(), word.begin(), ::toupper);
    } else {
        transform(word.begin(), word.end(), word.begin(), ::tolower);
    }

    cout << word;
}