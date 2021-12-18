#include<bits/stdc++.h>

using namespace std;

string replace(string str, char i, char j, char k) {
    string result;

    int n = str.size();
    int s = 0;
    while (s < n) {
        if (s + 1 < n && str[s] == i && str[s + 1] == j) {
            result.push_back(k);
            cout << "yo";
            s += 2;
        } else {
            result.push_back(str[s]);
            s++;
        }
    }

    return result;
}

int main() {
    int c;
    cin >> c;

    for (int k = 1; k <= c; k++) {
        int length;
        string s;

        cin >> length >> s;

        stack<char> stack;

        string result = s;

        while (true) {
            string temp;

            temp = replace(result, '0', '1', '2');
            temp = replace(result, '1', '2', '3');
            temp = replace(result, '2', '3', '4');
            temp = replace(result, '3', '4', '5');
            temp = replace(result, '4', '5', '6');
            temp = replace(result, '5', '6', '7');
            temp = replace(result, '6', '7', '8');
            temp = replace(result, '7', '8', '9');
            temp = replace(result, '8', '9', '0');
            temp = replace(result, '9', '0', '1');

            if (temp == result) {
                break;
            }

            result = temp;
        }

        cout << "Case #" + to_string(k) + ": " + result + "\n";
    }
}