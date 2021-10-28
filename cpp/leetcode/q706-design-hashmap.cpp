#include<bits/stdc++.h>

using namespace std;

class MyHashMap {
public:
    vector<int> hashMap;

    MyHashMap() {
        hashMap.resize(1000001, -1);
    }

    void put(int key, int value) {
        hashMap[key] = value;
    }

    int get(int key) {
        return hashMap[key];
    }

    void remove(int key) {
        hashMap[key] = -1;
    }
};