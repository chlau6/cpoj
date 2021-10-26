#include<bits/stdc++.h>

using namespace std;

int convert(bool b) {
    return b ? 1 : 0;
}

int main() {
    bool l0, l1, l2, l3, l4, l5, l6, l7, l8;
    l0 = l1 = l2 = l3 = l4 = l5 = l6 = l7 = l8 = true;

    int a, b, c, d, e, f, g, h, i;
    cin >> a >> b >> c >> d >> e >> f >> g >> h >> i;

    if (a % 2 != 0) {
        l0 = !l0;
        l1 = !l1;
        l3 = !l3;
    }

    if (b % 2 != 0) {
        l0 = !l0;
        l1 = !l1;
        l2 = !l2;
        l4 = !l4;
    }

    if (c % 2 != 0) {
        l1 = !l1;
        l2 = !l2;
        l5 = !l5;
    }

    if (d % 2 != 0) {
        l0 = !l0;
        l3 = !l3;
        l4 = !l4;
        l6 = !l6;
    }

    if (e % 2 != 0) {
        l1 = !l1;
        l3 = !l3;
        l4 = !l4;
        l5 = !l5;
        l7 = !l8;
    }

    if (f % 2 != 0) {
        l2 = !l2;
        l4 = !l4;
        l5 = !l5;
        l8 = !l8;
    }

    if (g % 2 != 0) {
        l3 = !l3;
        l6 = !l6;
        l7 = !l7;
    }

    if (h % 2 != 0) {
        l4 = !l4;
        l6 = !l6;
        l7 = !l7;
        l8 = !l8;
    }

    if (i % 2 != 0) {
        l5 = !l5;
        l7 = !l7;
        l8 = !l8;
    }

    cout << convert(l0) << convert(l1) << convert(l2) << "\n" << convert(l3) << convert(l4) << convert(l5) << "\n" << convert(l6) << convert(l7) << convert(l8) << "\n";
}