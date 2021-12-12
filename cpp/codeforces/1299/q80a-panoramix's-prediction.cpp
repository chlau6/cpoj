#include<bits/stdc++.h>

using namespace std;

int main() {
    int m, n;
    cin >> n >> m;

    vector<int> primes = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47};
    int size = primes.size();
    int i;

    for (i = 0; i < size - 1; i++) {
        if (primes[i] == n && primes[i + 1] == m) {
            cout << "YES";
            return;
        }
    }

    cout << "NO";
}
