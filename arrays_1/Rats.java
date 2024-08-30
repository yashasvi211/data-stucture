class Rats{
    static int ans(int arr[],int unit,int rats)
    {
        int tf=unit*rats;
        int cf=0;
        int home=0;
        for(int i=0;i<arr.length;i++,home++)
        {
            if(cf>tf)
            {
                break;
            }

            cf+=arr[i];
        }
 
        if(arr.length==0)
        {
            return -1;
        }
        else if(tf>cf)
        {
            return 0;
        }
        return home;
    }
    public static void main(String[] args) {
       System.out.println( ans(new int[]{2  ,3 ,5 ,1 ,4 ,1 ,2}, 2, 7));
    }
}