public class prime {
    public static void main(String[] args)
    {
        int i,j,n=10,c;
        for(i=2;i<=n;i++)
        {
            c=0;
            for(j=2;j<=i/2;j++)
            {
                if(i%j==0)
                    c=c+1;
            }
            if(c==0)
                System.out.println(i);
        }
    }
    
}
