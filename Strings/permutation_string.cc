#include<iostream>
using namespace std;
int main(void)
{
    string s1;
    cout<<"Enter the string:";
    getline(cin,s1);
    string s2;
    cout<<"Enter the permutation string:";
    getline(cin,s2);
    
    int arr[26]={0};
    for(int i=0;i<s1.size();i++)
    {
        int h=s1[i]-'a';
        arr[h]++;
 
    }
      for(int i=0;i<26;i++)
    {
        if(arr[i]==0)
        {
            continue;
        }
      cout<<arr[i]<<" ";
     
    }
 
}