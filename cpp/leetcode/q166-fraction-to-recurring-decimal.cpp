#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    string fractionToDecimal(int numerator, int denominator) {
        if (numerator == 0) return "0";

        string result;

        if ((numerator > 0) ^ (denominator > 0)) {
            result += '-';
        }

        long n = labs((long) numerator);
        long d = labs((long) denominator);

        result += to_string(n / d);

        long r = n % d;

        if (r == 0) return result;

        result += '.';

        unordered_map<long, int> map;

        while (r != 0) {
            if (map.count(r) > 0) {
                result.insert(map[r], "(");
                result += ')';

                break;
            }

            map[r] = result.size();
            r *= 10;
            result += to_string(r / d);
            r %= d;
        }

        return result;
    }
};