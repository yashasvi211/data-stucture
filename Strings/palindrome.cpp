#include <iostream>
using namespace std;
int main()
{
    string s="caabaac";
    string dj = s;
    int st = 0;
    int e = s.size() - 1;
    while (st < e)
    {
        swap(dj[st], dj[e]);
        st++;
        e--;
    }
    if (s == dj)
    {
      cout<<"true";
    }
    else
    {
        cout<<"false";
    }
}
