class FactorialOfNumberwhile
{
    public static void main(String args[])
    {
        int n=7;
        int fact=1;
        int i=1;
        while(i<=n)
        {
            fact=fact*i;
            i++;
        }
        System.out.println("Factorial of " + n +"is: " +fact);


    }
}