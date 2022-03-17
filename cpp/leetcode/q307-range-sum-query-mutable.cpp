#include<bits/stdc++.h>

using namespace std;

class NumArray {
public:
    vector<int> tree;
    int n;

    NumArray(vector<int>& nums) {
        n = nums.size();

        tree.resize(n * 2);

        for (int i = n; i < n * 2; i++) {
            tree[i] = nums[i - n];
        }

        for (int i = n - 1; i > 0; i--) {
            tree[i] = tree[i * 2] + tree[i * 2 + 1];
        }
    }

    void update(int index, int val) {
        int i = index + n;

        tree[i] = val;

        while (i > 0) {
            tree[i / 2] = tree[i] + tree[i ^ 1];
            i /= 2;
        }
    }

    int sumRange(int left, int right) {
        int i = left + n;
        int j = right + n;
        int result = 0;

        while (i <= j) {
            if (i % 2 == 1) result += tree[i++];
            if (j % 2 == 0) result += tree[j--];

            i /= 2;
            j /= 2;
        }

        return result;
    }
};