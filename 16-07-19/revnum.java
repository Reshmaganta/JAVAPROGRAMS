public class revnum {
public static void main(String[] args)
{
    int n=235,t,r=0;
	t=n;
        while(t!=0)
        {
	r=r*10;
	r=r+t%10;
        t=t/10;
        }
        System.out.print(r);
        
}
}
