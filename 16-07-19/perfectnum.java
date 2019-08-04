public class perfectnum {
    public static void main(String[] args)
    {
        int a=12,i,c=0;
        for(i=1;i<a;i++)
        {
            if(a%i==0)
            {
                c=c+i;
            }
        }
        if(c==a)
        {
            System.out.print("a is perfect number");
        }
        else
        {
            System.out.print("a is not a perfect number");
        }
            
        }
    }