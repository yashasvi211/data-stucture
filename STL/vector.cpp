#include<iostream>
#include<vector>
using namespace std;
int main()
{
    vector<int>arr;
    int i=0;
    cout<<"Enter a number to push in vector:";
    cin>>i;
    for(int j=0;j<i;j++)
    {
        int data;
        cout<<"Enter data for index "<<j<<":";
        cin>>data;
        arr.push_back(data);
    }
        for(int j=0;j<i;j++)
    {
 
        cout<<"Data of index "<<j<<":"<<arr[j]<<endl;
 
    }
    cout<<"Arr Back:"<<arr.back()<<endl;
    cout<<"Arr Capicity:"<<arr.capacity()<<endl;
    cout<<"Arr empty:"<<arr.empty() <<endl;
    
}