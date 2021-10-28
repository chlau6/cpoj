#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    vector<vector<int>> flipAndInvertImage(vector<vector<int>>& image) {
        int n = image[0].size();

        for (auto& row : image) {
            int i = 0;
            int j = n - 1;

            while (i <= j) {
                int temp = row[i] ^ 1;
                row[i++] = row[j] ^ 1;
                row[j--] = temp;
            }
        }

        return image;
    }
};