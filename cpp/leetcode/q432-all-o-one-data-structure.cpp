#include<bits/stdc++.h>

using namespace std;

class Bucket {
public:
    int count;
    unordered_set<string> words;
    Bucket* prev;
    Bucket* next;

    Bucket(int count) {
        this->count = count;
    }
};

class AllOne {
public:
    unordered_map<int, Bucket*> bucketsMap;
    unordered_map<string, int> countsMap;
    Bucket* head;
    Bucket* tail;

    AllOne() {
        head = new Bucket(INT_MIN);
        tail = new Bucket(INT_MAX);

        head->prev = NULL;
        head->next = tail;
        tail->prev = head;
        tail->next = NULL;
    }

    void deleteKey(Bucket* bucket, string key) {
        bucket->words.erase(key);

        if (bucket->words.empty()) {
            deleteBucket(bucket);
            bucketsMap.erase(bucket->count);
        }
    }

    void deleteBucket(Bucket* bucket) {
        bucket->prev->next = bucket->next;
        bucket->next->prev = bucket->prev;
    }

    void addBucket(Bucket* newBucket, Bucket* prevBucket) {
        newBucket->prev = prevBucket;
        newBucket->next = prevBucket->next;
        prevBucket->next->prev = newBucket;
        prevBucket->next = newBucket;
    }

    void changeKey(string key, int offset) {
        int count = countsMap[key];

        countsMap[key] = count + offset;
        Bucket* currBucket = bucketsMap[count];
        Bucket* newBucket;

        if (bucketsMap.count(count + offset)) {
            newBucket = bucketsMap[count + offset];
        } else {
            newBucket = new Bucket(count + offset);
            bucketsMap[count + offset] = newBucket;
            addBucket(newBucket, offset == 1 ? currBucket : currBucket->prev);
        }

        newBucket->words.insert(key);
        deleteKey(currBucket, key);
    }

    void inc(string key) {
        if (countsMap.count(key)) {
            changeKey(key, 1);
        } else {
            countsMap[key] = 1;

            if (head->next->count != 1) {
                addBucket(new Bucket(1), head);
            }

            head->next->words.insert(key);
            bucketsMap[1] = head->next;
        }
    }

    void dec(string key) {
        int count = countsMap[key];

        if (count == 1) {
            countsMap.erase(key);
            deleteKey(bucketsMap[count], key);
        } else {
            changeKey(key, -1);
        }
    }

    string getMaxKey() {
        return tail->prev == head ? "" : *tail->prev->words.begin();
    }

    string getMinKey() {
        return head->next == tail ? "" : *head->next->words.begin();
    }
};