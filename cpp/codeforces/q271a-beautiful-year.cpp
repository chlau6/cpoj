#include<bits/stdc++.h>

using namespace std;

int main() {
    int oldYear;
    cin >> oldYear;

    while (true) {
        vector<int> v(10, 0);

        ++oldYear;

        int a = oldYear / 1000;
        int b = oldYear / 100 % 10;
        int c = oldYear / 10 % 10;
        int d = oldYear % 10;

        if (a != b && a != c && a != d && b != c && b != d && c != d) break;
    }
    cout << oldYear;
}