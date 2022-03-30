#include<bits/stdc++.h>

using namespace std;

class RandomizedCollection {
public:
    vector<int> v;
    unordered_map<int, unordered_set<int>> map;

    RandomizedCollection() {

    }

    bool insert(int val) {
        map[val].insert(v.size());
        v.push_back(val);

        return map[val].size() == 1;
    }

    bool remove(int val) {
        if (map[val].empty()) return false;

        int index = *map[val].begin();
        int last = v.size() - 1;
        map[val].erase(index);

        if (index != last) {
            int tail = v.back();
            map[tail].erase(last);
            map[tail].insert(index);
            v[index] = tail;
        }

        v.pop_back();

        return true;
    }

    int getRandom() {
        return v[rand() % v.size()];
    }
};
