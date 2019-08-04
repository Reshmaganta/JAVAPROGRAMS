public class nestedif {
    public static void main(String[] args)
    {
        int a=10,b=20,c=5;
        if(a>b)
        {
            if (a>c)
                 System.out.print("a is greater");
            else
                 System.out.print("c is greater");
        }
        else
        {
            if(b>c)
                 System.out.print("b is greater");
            else
                 System.out.print("c is greater");
        }
  
        
    }
    
}
