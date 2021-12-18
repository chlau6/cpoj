#include<bits/stdc++.h>

using namespace std;

int main() {
    int n;
    cin >> n;

    unordered_map<int, int> map;
    for (int i = 1; i < n; i++) {
        cin >> num;
        map[num] = i;
    }

    int q, num, result1 = 0, result2 = 0;
    cin >> q;

    for (int i = 0; i < q; i++) {
        cin >> q;
        int index = map[q];
        result1 += index;
        result2 += (n - index);
    }

    cout << result1 << " " << result2;
}