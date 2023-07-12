#include <iostream>
#include <vector>
#include <algorithm>

class Solution {
public:
    std::vector<std::vector<int>> merge(std::vector<std::vector<int>>& intervals) {
        std::vector<std::vector<int>> ans;
        int n = intervals.size();
        std::sort(intervals.begin(), intervals.end());
        
        for (int i = 0; i < n; i++) {
            if (ans.empty() || intervals[i][0] > ans.back()[1]) {
                // Overlap does not exist
                ans.push_back({ intervals[i][0], intervals[i][1] });
            } else {
                // Overlap exists
                ans.back()[1] = std::max(ans.back()[1], intervals[i][1]);
            }
        }
        
        return ans;
    }
};

int main() {
    Solution solution;
    
    // Example usage
    std::vector<std::vector<int>> intervals = { {1, 3}, {2, 6}, {8, 10}, {15, 18} };
    std::vector<std::vector<int>> mergedIntervals = solution.merge(intervals);
    
    // Print the merged intervals
    for (const auto& interval : mergedIntervals) {
        std::cout << "[" << interval[0] << ", " << interval[1] << "] ";
    }
    std::cout << std::endl;
    
    return 0;
}
