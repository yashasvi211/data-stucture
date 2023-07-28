    #include<iostream>
    #include<vector>
    using namespace std;
    vector<int> reverse(vector<int> v)
    {
        int s=0;
        int e=v.size()-1;
         while (s < e)
    {
        swap(v[s], v[e]);
        s++;
        e--;
    }
    return v;
    }
    void print(vector<int> v)
    {
        for(int i:v)
        {
            cout<<i<<" ";
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

        vector <int> ans=reverse(v);
        cout<<"The reverse array is:";
        print(ans);
    }