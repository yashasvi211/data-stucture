import java.util.Arrays;

public class insertion {

    public static void insertionsort(int[] arr)
    {
          int n=arr.length;
          for(int i=1;i<n;i++)
          {
            int temp=arr[i];
            int j=i-1;
            while(j>=0)
            {
                if(arr[j]>temp)
                {
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
                else{
                    break;
                }
                j--;
            }

          }
    }

    public static void main(String args[]) {
         int[] arr={4,3,2,1};
         insertionsort(arr);
         System.out.println(Arrays.toString(arr));
    }
}