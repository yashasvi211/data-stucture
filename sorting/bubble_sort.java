class bubble_sort
{
    public static void sort(int arr[])
    {
        for(int i=0;i<=arr.length-2;i++)
        {
            for(int j=0;j<=arr.length-i-2;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
        }

    }
    public static void print(int arr[])
    {
         for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String args[])
    {
        int arr[]={5,4,1,3};
      
        System.out.println("Elements before sorting:");
        print(arr);
        sort(arr);
        System.out.println("\nElements after sorting:");
         print(arr);
    }
}