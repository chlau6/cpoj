#include<bits/stdc++.h>

using namespace std;

class OrderedStream {
public:
    int pointer = 0;
    vector<string> array;
    int n;

    OrderedStream(int n) {
        this->array.resize(n);
        this->n = n;
    }

    vector<string> insert(int idKey, string value) {
        array[idKey - 1] = value;

        vector<string> result;

        while (pointer < n && !array[pointer].empty()) {
            result.push_back(array[pointer]);
            pointer++;
        }

        return result;
    }
};