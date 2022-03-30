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

        int index = map[val];

        if (index != v.size() - 1) {
            int tail = v.back();
            map[tail] = index;
            v[index] = tail;
        }

        v.pop_back();
        map.erase(val);

        return true;
    }

    int getRandom() {
        return v[rand() % v.size()];
    }
};
