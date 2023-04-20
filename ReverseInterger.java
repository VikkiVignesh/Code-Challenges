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
        System.out.pritnln("Reverse of Number is : "+reverse(num));
         
        // System.out.println(Integer.MAX_VALUE);   -> Displays the Maximum limit of integer 
        // System.out.println(Integer.MIN_VALUE);  -> Displays the Minimum limit of Integer
        
        sc.close();
    }
// here they clearly mention that number should in the range of -2^31 to 2^31
    static int reverse(int x)
    {
        int res=0;
        int rem; //for storing remainder value
        while(x!=0)
        {   rem=x%10;
            x=x/10
             // 2^31-1=2,14,74,83,647  ,here can can observer that last digit is 7 .
             if(res>Integer.MAX_VALUE /10 || (res==Integer.MAX_VALUE /10 && x>7)
                {
                    return 0;
                }
                
              // -2^31=-2,14,74,83,6478 ,here can can observer that last digit is 8 . but while dividing the number using Modulus opertor we are getting -8 so -8 is last digit here.
                if(res<Integer.MAX_VALUE /10 || (res==Integer.MAX_VALUE /10 && x<-8)
                {
                    return 0;
                }
            if(res>
            res=res*10+rem;
        }
          return res;     
    }
}
