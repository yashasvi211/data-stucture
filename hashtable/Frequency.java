import java.util.*;
class Frequency
{
    
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,5,1,2};
        int n=arr.length;
        Map<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            if(!map.containsKey(arr[i]))
            {
                map.put(arr[i],1);
            }else{
                map.put(arr[i],map.get(arr[i])+1);
            }
        }
        System.out.println(map);
    }
}