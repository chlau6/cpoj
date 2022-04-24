#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    int findMinStep(string board, string hand) {
        vector<int> counts(26, 0);
        unordered_map<string, int> map;

        for (char c : hand) {
            counts[c - 'A']++;
        }

        return dfs(map, counts, board);
    }

    int dfs(unordered_map<string, int>& map, vector<int>& counts, string board) {
        if (board.empty()) return 0;

        string key = board + "#" + serialize(counts);

        if (map.count(key)) return map[key];

        int result = INT_MAX;
        int m = board.size();

        for (int i = 0; i <= m; i++) {
            for (int j = 0; j < 26; j++) {
                bool trying = false;

                if (board[i] - 'A' == j || i > 0 && board[i] == board[i - 1] && board[i] - 'A' != j) {
                    trying = true;
                }

                if (counts[j] > 0 && trying) {
                    board.insert(board.begin() + i, j + 'A');
                    counts[j]--;

                    string newBoard = updateBoard(board);
                    int steps = dfs(map, counts, newBoard);

                    if (steps != -1) {
                        result = min(result, steps + 1);
                    }

                    counts[j]++;
                    board.erase(board.begin() + i);
                }
            }
        }

        if (result == INT_MAX) {
            result = -1;
        }

        map[key] = result;

        return result;
    }

    string updateBoard(string board) {
        int start = 0;
        int end = 0;
        int m = board.size();

        while (start < m) {
            while (end < m && board[start] == board[end]) {
                end++;
            }

            if (end - start >= 3) {
                string newBoard = board.substr(0, start) + board.substr(end);
                return updateBoard(newBoard);
            } else {
                start = end;
            }
        }

        return board;
    }

    string serialize(vector<int>& counts) {
        string key = "";

        for(int i = 0; i < 26; i++) {
            if(counts[i] > 0) {
                key += to_string((char) i + 'A') + to_string(counts[i]);

            }
        }

        return key;
    }
};