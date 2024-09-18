class factorial{
    static int findfact(int no)
    {
        if(no==1)
        {
            System.out.println(no+" ");
            return 1;
        }
       
        return no*findfact(no-1);

    }
    public static void main(String[] args) {
        System.out.println(findfact(5));
    }
 }