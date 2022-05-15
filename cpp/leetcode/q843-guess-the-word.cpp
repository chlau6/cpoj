#include<bits/stdc++.h>

using namespace std;

class Master {
public:
    int guess(string& a) {
        return 0;
    }
};

class Solution {
public:
    void findSecretWord(vector<string>& wordlist, Master& master) {
        srand(time(NULL));
        int matches = 0;

        for (int i = 1; i <= 10; i++) {
            int random = rand() % wordlist.size();
            string w = wordlist[random];

            matches = master.guess(w);
            if (matches == 6) return;

            vector<string> updatedList;
            for (string& word : wordlist) {
                if (similarity(w, word) == matches) {
                    updatedList.push_back(word);
                }
            }

            wordlist = updatedList;
        }
    }

    int similarity(string a, string b) {
        int similarity = 0;

        for (int i = 0; i < 6; i++) {
            if (a[i] == b[i]) {
                similarity++;
            }
        }

        return similarity;
    }
};