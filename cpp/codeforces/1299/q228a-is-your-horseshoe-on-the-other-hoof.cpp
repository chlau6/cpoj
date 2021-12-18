#include<bits/stdc++.h>

using namespace std;

int main() {
    vector<int> v(4);
    cin >> v[0] >> v[1] >> v[2] >> v[3];

    sort(v.begin(), v.end());
    v.erase(unique(v.begin(), v.end()), v.end());
    cout << 4 - v.size();
}