#include<iostream>
#include<queue>
using namespace std;
int main()
{ 
       priority_queue<int> pq;
       pq.push(1);
       pq.push(2);
       pq.push(3);
       pq.push(4);
       pq.push(5);
       int k=2;
      
      // int a=pq.size()-k; for smallest 
        for(int j=0;j<k-1;j++)     //for largest
        {
            pq.pop();
        }
        int ans=pq.top();
        cout<<ans; 
}