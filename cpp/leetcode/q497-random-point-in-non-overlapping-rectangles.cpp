#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    map<int, int> treeMap;
    vector<vector<int>> rects;
    int totalArea = 0;

    Solution(vector<vector<int>>& rects) {
        this->rects = rects;

        for (auto& rect : rects) {
            totalArea += (rect[2] - rect[0] + 1) * (rect[3] - rect[1] + 1);
            treeMap[totalArea] = treeMap.size();
        }
    }

    vector<int> pick() {
        int value = rand() % totalArea;
        int index = treeMap.upper_bound(value)->second;
        int width = rects[index][2] - rects[index][0] + 1;
        int length = rects[index][3] - rects[index][1] + 1;

        return {rand() % width + rects[index][0], rand() % length + rects[index][1]};
    }
};