#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    string validIPAddress(string queryIP) {
        if (queryIP.empty()) return "Neither";

        if (isValidIPv4(queryIP)) return "IPv4";
        if (isValidIPv6(queryIP)) return "IPv6";

        return "Neither";
    }

    bool isValidIPv4(string ip) {
        int n = ip.length();

        if (ip[0] == '.' || ip[n - 1] == '.') return false;

        istringstream iss(ip);
        int count = 0;
        string part = "";

        while (getline(iss, part, '.')) {
            count++;

            if (count > 4) return false;

            if (!isValidIPv4Part(part)) return false;
        }

        return count == 4;
    }

    bool isValidIPv6(string ip) {
        int n = ip.length();

        if (ip[0] == ':' || ip[n - 1] == ':') return false;

        istringstream iss(ip);
        int count = 0;
        string part = "";

        while (getline(iss, part, ':')) {
            count++;

            if (count > 8) return false;

            if (!isValidIPv6Part(part)) return false;
        }

        return count == 8;
    }

    bool isValidIPv4Part(string part) {
        int n = part.size();

        if (n == 0 || n > 3) return false;

        if (part[0] == '0') return n == 1;

        for (char c : part) {
            if (!isdigit(c)) return false;
        }

        return stoi(part) <= 255;
    }

    bool isValidIPv6Part(string part) {
        int n = part.size();

        if (n == 0 || n > 4) return false;

        for (char c : part) {
            if (!(isdigit(c) || (c >= 'a' && c <= 'f') || (c >= 'A' && c <= 'F'))) return false;
        }

        return true;
    }
};