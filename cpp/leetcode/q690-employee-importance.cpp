#include<bits/stdc++.h>

using namespace std;

class Employee {
public:
    int id;
    int importance;
    vector<int> subordinates;
};

class Solution {
public:
    int getImportance(vector<Employee*> employees, int id) {
        unordered_map<int, Employee*> map;

        for (auto e : employees) {
            map[e->id] = e;
        }

        return helper(map, employees, id);
    }

    int helper(unordered_map<int, Employee*> map, vector<Employee*> employees, int id) {
        auto e = map[id];
        int sum = e->importance;

        for (int subordinate : e->subordinates) {
            sum += helper(map, employees, subordinate);
        }

        return sum;
    }
};