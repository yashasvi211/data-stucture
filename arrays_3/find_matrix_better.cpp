#include <iostream>
#include <vector>
using namespace std;

bool searchMatrix(vector<vector<int>>& matrix, int target) {
    int col = matrix[0].size();
    int row = matrix.size();
    int j = 0;
    int i = row - 1;
    while (i >= 0 && j < col) {
        if (matrix[i][j] == target) {
            cout << "The element is at: " << i << "," << j << endl;
            return true;
        } else if (matrix[i][j] > target) {
            i--;
        } else {
            j++;
        }
    }
    return false;
}

int main() {
    vector<vector<int>> matrix =
    {
        {12,13, 24},
        {14,20,60},
        {54,83,90}
    };
    int target = 83;
    if (searchMatrix(matrix, target)) {
        cout << "Target element found!" << endl;
    } else {
        cout << "Target element not found!" << endl;
    }

    return 0;
}
