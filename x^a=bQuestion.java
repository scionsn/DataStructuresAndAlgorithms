 // x^a=b , we have both a and b both , we need to find x 
 class prac {
    public static void main(String[] args) {
    System.out.println(helper(2,4));
    }


    static int helper(int a, int b)
    {
    
for(int i=0;i<=b;i++)
{
    if(Math.pow(i, a)==b)
    return i;
}

return -1;
    }
}
