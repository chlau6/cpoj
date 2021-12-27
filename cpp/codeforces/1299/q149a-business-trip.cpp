#include<bits/stdc++.h>

using namespace std;

int main() {
    int k, a;
    cin >> k;
    vector<int> m(12);

    for (int i = 0; i < 12; i++) {
        cin >> a;
        m[i] = a;
    }

    sort(m.begin(), m.end(), greater<int>())
    int result = 0;
    int i = 0;

    while (k > 0 && i < 12) {
        result += m[i++];
    }

    cout << (k > 0 ? -1 : result);
}
