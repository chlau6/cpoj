#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    string t = "https://tinyurl.com/";
    unordered_map<string, string> map;

    // Encodes a URL to a shortened URL.
    string encode(string longUrl) {
        string url = t + hex(longUrl);

        map[url] = longUrl;

        return url;
    }

    // Decodes a shortened URL to its original URL.
    string decode(string shortUrl) {
        return map[shortUrl];
    }

    string hex(string longUrl) {
        string charSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

        string result;

        for (int i = 0; i < 6; i++) {
            result.push_back(charSet[rand() % 62]);
        }

        return result;
    }
};