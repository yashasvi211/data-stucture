#include <iostream>
#include <vector>
using namespace std;
vector<int> spiral(vector<vector<int>>&mtx)
{

    vector<int> ans;
    int row = mtx.size();
    int col = mtx[0].size();

    int count = 0;
    int total = row * col;

    // index initialisation
    int startingRow = 0;
    int startingCol = 0;
    int endingRow = row - 1;
    int endingCol = col - 1;

    while (count < total)
    {

        // print starting row
        for (int index = startingCol; count < total && index <= endingCol; index++)
        {
            ans.push_back(mtx[startingRow][index]);
            count++;
        }
        startingRow++;

        // print ending column
        for (int index = startingRow; count < total && index <= endingRow; index++)
        {
            ans.push_back(mtx[index][endingCol]);
            count++;
        }
        endingCol--;

        // print ending row
        for (int index = endingCol; count < total && index >= startingCol; index--)
        {
            ans.push_back(mtx[endingRow][index]);
            count++;
        }
        endingRow--;

        // print starting column
        for (int index = endingRow; count < total && index >= startingRow; index--)
        {
            ans.push_back(mtx[index][startingCol]);
            count++;
        }
        startingCol++;
    }
    return ans;
}
int main()
{
    vector<vector<int>> mtx = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        int row = mtx.size();
    int col = mtx[0].size();
    vector<int> ans=spiral(mtx);
    for(int i=0;i<ans.size();i++)
    {
        cout<<ans[i]<<" ";
    }
}