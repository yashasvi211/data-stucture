#include <bits/stdc++.h> 
using namespace std;
char uppercase(char ch)
{
    if(ch>='A' && ch<='Z')
    {
        return ch;
    }
    else
    {
        char temp=ch-'a'+'A';
        return temp;
    }
}
int main()
{
    string s="Poo@p";
        string dj=s;
        int st=0;
        int e=s.size()-1;
        while(st<=e)
        {
            if(uppercase(dj[st])!=uppercase(dj[e]))
            {
                cout<<"false";
                return 0;
            }
            else{
                 st++;
            e--;
            }
           
        }
            cout<<"true";
    
}