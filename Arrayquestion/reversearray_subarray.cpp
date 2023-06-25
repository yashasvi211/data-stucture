#include <iostream>
#include <vector>
using namespace std;
vector<int> reverse(vector<int> v,int m)
{
     
    int e = v.size() - 1;
    while (m < e)
    {
        swap(v[m], v[e]);
        m++;
        e--;
    }
    return v;
}
void print(vector<int> v)
{
    for (int i : v)
    {
        cout << i << " ";
    }
}
int main(void)
{
    vector<int> v;
    v.push_back(1);
    v.push_back(2);
    v.push_back(3);
    v.push_back(4);
    v.push_back(5);
    v.push_back(12);
    cout<<"Enter the index:";
    int m=0;
    cin>>m;
    vector<int> ans = reverse(v,m);
    cout << "The reverse array is:";
    print(ans);
}