#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    int countTriples(int n) {
        int result = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = i + 1; j <= n; j++) {
                int sum = i * i + j * j;
                int c = sqrt(sum);

                if (c * c == sum && c <= n) {
                    result += 2;
                }
            }
        }

        return result;
    }
};