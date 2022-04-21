#include<bits/stdc++.h>

using namespace std;

class LFUCache {
public:
    unordered_map<int, pair<int, int>> cache;
    unordered_map<int, list<int>> frequency;
    unordered_map<int, list<int>::iterator> iterator;
    int maxCapacity;
    int minFreq;


    LFUCache(int capacity) {
        maxCapacity = capacity;
    }

    int get(int key) {
        if (!cache.count(key)) return -1;

        int oldFreq = cache[key].second;

        frequency[oldFreq].erase(iterator[key]);
        int freq = ++cache[key].second;
        frequency[freq].push_back(key);
        iterator[key] = --frequency[freq].end();

        if (frequency[minFreq].size() == 0) {
            minFreq++;
        }

        return cache[key].first;
    }

    void put(int key, int value) {
        if (maxCapacity <= 0) return;

        if (get(key) != -1) {
            cache[key].first = value;
            return;
        }

        if (cache.size() >= maxCapacity) {
            int lfuKey = frequency[minFreq].front();
            cache.erase(lfuKey);
            iterator.erase(lfuKey);
            frequency[minFreq].pop_front();
        }

        cache[key] = {value, 1};
        frequency[1].push_back(key);
        iterator[key] = --frequency[1].end();
        minFreq = 1;
    }
};