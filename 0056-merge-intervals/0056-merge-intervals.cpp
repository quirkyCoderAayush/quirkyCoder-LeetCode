#include <bits/stdc++.h>
#include <iostream>
#include <iomanip>
#include <array>
#include <vector>
class Solution {
public:
    vector<vector<int>> merge(vector<vector<int>>& intervals) {
    int n=intervals.size()-1;
    sort(intervals.begin(), intervals.end());

    vector<vector<int>> v2;
    vector<int> temp = intervals[0];

    for(int i=0; i<=n; i++) {
        if(temp[1] >= intervals[i][0]) {
            temp[1] = max(temp[1], intervals[i][1]);
        }
        else {
            v2.push_back(temp);
            temp=intervals[i];
        }
    }
    v2.push_back(temp);
    return v2;
    }
};