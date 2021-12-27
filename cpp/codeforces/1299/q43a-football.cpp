#include<bits/stdc++.h>

using namespace std;

int main() {
    int n;
    cin >> n;

    int goal = 0;
    string win, team;

    for (int i = 0; i < n; i++) {
        cin >> team;
        if (goal == 0) {
            win = team;
            goal++;
        } else if (goal > 0) {
            if (win == team) {
                goal++;
            } else {
                goal--;
            }
        }
    }

    cout << win;
}
