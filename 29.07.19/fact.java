// A simple example of recursion. 

import java.util.Scanner;//For scanning the input

class fact
 { 
// this is a recursive function 
    int fact(int n) 
    { 
    int result;
    if(n==1)
    return 1; 
    result = fact(n-1) * n;
    return result;
    }
 }
class Recursion 
{ 
public static void main(String args[]) 
{ 
fact f = new fact();
Scanner ob=new Scanner(System.in);
System.out.print("Enter a number:");
int x=ob.nextInt();
System.out.println("Factorial of 3 is " + f.fact(x)); 
}
}
