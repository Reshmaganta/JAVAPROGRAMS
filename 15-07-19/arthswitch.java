public class arthswitch {
    public static void main(String[] rgs)
    {
        int a=10,b=20,c;
        char operator='-';
       switch(operator)
        {
           case '+':c=a+b;
           System.out.print(c);
               break;
           case '-':c=a-b;
           System.out.print(c);
               break;
           case '*':c=a*b;
           System.out.print(c);
               break;
            case '/':c=a/b;
            System.out.print(c);
               break;
             case '%':c=a%b;
             System.out.print(c);
               break; 
             default:
                 System.out.print("invalid output");
                 
       }
             
            
    }
    
}
