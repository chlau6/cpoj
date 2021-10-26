#include<bits/stdc++.h>

using namespace std;

int main() {
    vector<vector<int>> matrix(5, vector<int>(5));

    int xOne, yOne;
    for (int i = 0; i < 5; i++) {
        for (int j = 0; j < 5; j++) {
            cin >> matrix[i][j];

            if (matrix[i][j] == 1) {
                xOne = i;
                yOne = j;
            }
        }
    }

    cout << abs(2 - xOne) + abs(2 - yOne);
}