#include<bits/stdc++.h>

using namespace std;

int main() {
    string x, y, z;
    cin >> x >> y >> z;

    vector<int> v(26);

    for (char c : x) v[c - 'A']++;

    for (char c : y) v[c - 'A']++;

    for (char c : z) v[c - 'A']--;

    cout << (count(v.begin(), v.end(), 0) == 26 ? "YES" : "NO");
}