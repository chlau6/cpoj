#include<bits/stdc++.h>

using namespace std;

class LRUCache {
public:
    list<pair<int, int>> cache;
    map<int, list<pair<int, int>>::iterator> map;
    int maxSize;

    LRUCache(int capacity) {
        maxSize = capacity;
    }

    int get(int key) {
        auto it = map.find(key);
        if (it == map.end()) return -1;
        cache.splice(cache.begin(), cache, it->second);
        return it->second->second;
    }

    void put(int key, int value) {
        auto it = map.find(key);
        if (it != map.end()) cache.erase(it->second);
        cache.push_front(make_pair(key, value));
        map[key] = cache.begin();

        if (map.size() > maxSize) {
            int oldKey = cache.rbegin()->first;
            cache.pop_back();
            map.erase(oldKey);
        }
    }
};