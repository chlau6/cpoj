#include<bits/stdc++.h>

using namespace std;

int main() {
    bool a, b, c, d, e, f, g, h, i;
    a = b = c = d = e = f = g = h = i = true;

    int l1, l2, l3, l4, l5, l6, l7, l8, l9;
    cin >> l1 >> l2 >> l3 >> l4 >> l5 >> l6 >> l7 >> l8 >> l9;

    if ((l1 + l2 + l4) % 2 != 0) {
        a = !a;
    }

    if ((l1 + l2 + l3 + l5) % 2 != 0) {
        b = !b;
    }

    if ((l2 + l3 + l6) % 2 != 0) {
        c = !c;
    }

    if ((l1 + l4 + l5 + l7) % 2 != 0) {
        d = !d;
    }

    if ((l2 + l4 + l5 + l6 + l8) % 2 != 0) {
        e = !e;
    }

    if ((l3 + l5 + l6 + l9) % 2 != 0) {
        f = !f;
    }

    if ((l4 + l7 + l8) % 2 != 0) {
        g = !g;
    }

    if ((l5 + l7 + l8 + l9) % 2 != 0) {
        h = !h;
    }

    if ((l6 + l8 + l9) % 2 != 0) {
        i = !i;
    }

    cout << a << b << c << "\n" << d << e << f << "\n" << g << h << i << "\n";
}