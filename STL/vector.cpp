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
        arr.push_back(data);
    }
        for(int j=0;j<i;j++)
    {
        int data;
        cout<<"Data of index "<<j<<":"<<arr[j];
 
    }
    cout<<"Arr back"<<arr.back()<<endl;
    cout<<"arr capicity"<<arr.capacity()<<endl;
    cout<<"arr empty"<<arr.empty()<<endl;
    
}