public class palindrome {
    public static void main(String[] args)
    {
        int n=252,r=0,t;
	t=n;
        while(t!=0)
        {
	r=r*10;
	r=r+t%10;
        t=t/10;
        }
        if(n==r)
        {
	System.out.print("n is palindrome");
        
    }
        else
        {
            System.out.print("n is not palindrome");
        }
            
        }
    
}
