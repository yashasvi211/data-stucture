import java.util.Scanner;

public class CountSuperior {
    public static void main(String[] args) {

        int count = 0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
        
            int a=sc.nextInt();
            arr[i]=a;
        }

        for(int i=0;i<n;i++)
        {
            int curr=arr[i];
            boolean test=true;
            for(int j=i+1;j<n;j++)
            {
                if(curr<arr[j])
                {
                    test=false;
                    break;
                }
            }
            if(test==true)
            {
                count++;
            }
        }
        sc.close();
        System.out.println("The count is "+count);

    }
}
