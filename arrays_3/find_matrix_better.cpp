#include <iostream>
#include <vector>
using namespace std;

void binary_search(vector<vector<int>> arr, int target)
{
    int row=arr.size();
    int col=arr[0].size();
 
    int i=row-1;
    int j=0;
    while(j<col and i>=0)
    {
        if(arr[i][j]==target)
        {
            cout<<"The element is at:"<<arr[i][j];
        }
        
    }
    

}
int main()
{
    /*
    Condition:
    Only applicable if matrix if row wise and col wise sorted like:
    e.g:
    11 20 31 32
    15 29 39 50
    16 30 40 80
                                or
    Also applicable if matix is fully sorted like:
    e.g:
    11 20 31 32
    35 40 45 50
    55 60 61 65
    Note:If this is the condition we can apply full binary sort which is benificial.

    */
    vector<vector<int>> arr =
        {
            {43, 12, 43},
            {421, 11, 65},
            {54, 23, 10}};
    auto target = 12;

   

    return 0;
}