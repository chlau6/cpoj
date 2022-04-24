#include<bits/stdc++.h>

using namespace std;

class UndergroundSystem {
public:
    unordered_map<int, pair<string, int>> checkInMap;
    unordered_map<string, pair<int, int>> averageTime;

    UndergroundSystem() {

    }

    void checkIn(int id, string stationName, int t) {
        checkInMap[id] = {stationName, t};
    }

    void checkOut(int id, string stationName, int t) {
        auto& checkInStatus = checkInMap[id];

        string key = checkInStatus.first + " " + stationName;
        int time = t - checkInStatus.second;

        auto& value = averageTime[key];
        value.first += time;
        value.second++;
    }

    double getAverageTime(string startStation, string endStation) {
        string key = startStation + " " + endStation;

        auto& value = averageTime[key];

        return (double) value.first / value.second;
    }
};