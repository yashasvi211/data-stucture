#include<iostream>
#include<vector>
using namespace std;

void liner_search(vector<vector<int>> arr,int target)
{
    int row=arr.size();
    int col=arr[0].size();
    for(int i=0;i<row;i++)
    {
        for(int j=0;j<col;j++)
        {
            if(arr[i][j]==target)
            {
                    cout<<"The element is at loc:"<<i<<","<<j;
             
            }
        
        }
    }
    
}
int main()
{
    vector<vector<int>>arr=
    {
        {43,12,43},
        {421,11,65},
        {54,23,10}
    };
    auto target=12;
 
 
   
         liner_search(arr,target);
 

    return 0;
}