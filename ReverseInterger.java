/*Given a signed 32-bit integer x, return x with its digits reversed. 
If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0. */
import java.util.*;
import java.lang.Math;
public class ReverseInterger{
    public static void main(String[] args) 
    {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter any Number : ");
        int num=sc.nextInt();
        int res=0;
        System.out.println(Math.pow(2, 31));
        while(num!=1)
        {
            res=res*10+num%10;
            num=num/10;
            if(res<(Math.pow(-2,31)) &&res>(Math.pow(2,31)-1) )
           {
             System.out.println("Not Possible");
           }
            System.out.println(res+" "+num);
        }
        System.out.println("Reversed Number is : "+res);
         
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        
        sc.close();
    }

    static int reverse(int x)
    {
        int res=0;
        while(x!=-1)
        {
            res=res*10+x%10;
            x=x/10;
        }
        if(x>(Math.pow(-2,31)) &&x<(Math.pow(2,31)-1) )
        {
          return res;
        }
        else
          return 0;     
    }
}
