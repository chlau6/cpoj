#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    bool squareIsWhite(string coordinates) {
        return coordinates[0] % 2 != coordinates[1] % 2;
    }
};