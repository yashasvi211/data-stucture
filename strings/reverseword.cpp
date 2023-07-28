#include<iostream>
using namespace std;
void reverseword(string &str,int s,int e)
{
    while(s<e)
    {
        swap(str[s++],str[e--]);
    }
}
int main(void)
{
    cout<<"Enter the string:";
    string str;
    getline(cin,str);
    int s=0;
    int e=0;
    int i;
    while(true)
    {
        if(str[e]==' ' or str[e]=='\0')
        {
            reverseword(str,s,e-1);
            s=e+1;
        }
        if(str[e]=='\0')
        {
            break;
        }
            e++;
    }
    cout<<"Reverse name:"<<str;
}