#include<bits/stdc++.h>

using namespace std;

class DisjointSetUnion {
public:
    vector<int> parent;

    DisjointSetUnion(int n) {
        parent.resize(n);

        for (int i = 0; i < n; i++) {
            parent[i] = i;
        }
    }

    void unionPoint(int u, int v) {
        int uRoot = find(u);
        int vRoot = find(v);

        parent[uRoot] = vRoot;
    }

    int find(int x) {
        if (parent[x] != x) {
            parent[x] = find(parent[x]);
        }

        return parent[x];
    }
};



class Solution {
public:
    struct Compare {
        bool operator()(vector<int>& a, vector<int>& b) {
            return a[0] > b[0];
        }
    };

    int minCostConnectPoints(vector<vector<int>>& points) {
        int n = points.size();
        int result = 0;

        priority_queue<vector<int>, vector<vector<int>>, Compare> pq;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int dist = getDist(points[i], points[j]);
                pq.push({dist, i, j});
            }
        }

        DisjointSetUnion dsu(n);
        int count = 0;

        while (count < n - 1) {
            auto edge = pq.top();
            pq.pop();

            if (dsu.find(edge[1]) != dsu.find(edge[2])) {
                result += edge[0];
                count++;
                dsu.unionPoint(edge[1], edge[2]);
            }
        }

        return result;
    }

    int getDist(vector<int>& p1, vector<int>& p2) {
        return abs(p1[0] - p2[0]) + abs(p1[1] - p2[1]);
    }
};