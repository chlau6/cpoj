#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    int rand10() {
        while (true) {
            int num = (rand7() - 1) * 7 + rand7();
            if (num <= 40) return num % 10 + 1;
        }
    }

    int rand7() {
        return 0; // implementation is hidden;
    }
};