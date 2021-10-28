#include<bits/stdc++.h>

using namespace std;

class MyHashSet {
public:
    vector<bool> hashSet;

    MyHashSet() {
        hashSet.resize(1000001);
    }

    void add(int key) {
        hashSet[key] = true;
    }

    void remove(int key) {
        hashSet[key] = false;
    }

    bool contains(int key) {
        return hashSet[key];
    }
};