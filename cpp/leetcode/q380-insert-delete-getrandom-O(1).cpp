#include<bits/stdc++.h>

using namespace std;

class RandomizedSet {
public:
    unordered_map<int, int> map;
    vector<int> v;

    RandomizedSet() {

    }

    bool insert(int val) {
        if (map.count(val)) return false;

        v.push_back(val);
        map[val] = v.size() - 1;

        return true;
    }

    bool remove(int val) {
        if (!map.count(val)) return false;

        int tail = v.back();
        int valuePos = map[val];
        map[tail] = valuePos;
        v[valuePos] = tail;
        v.pop_back();
        map.erase(val);

        return true;
    }

    int getRandom() {
        return v[rand() % v.size()];
    }
};