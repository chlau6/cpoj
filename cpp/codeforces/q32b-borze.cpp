#include<bits/stdc++.h>

using namespace std;

int main() {
    string encode;
    string decode = "";
    string zero = "0";
    string one = "1";
    string two = "2";

    cin >> encode;
    int length = encode.size();
    for (int i = 0; i < length; i++) {
        if (encode[i] == '.') {
            decode += zero;
        } else if (encode[i] == '-' && encode[i + 1] == '.') {
            decode += one;
            i++;
        } else {
            decode += two;
            i++;
        }
    }
    cout << decode;
}