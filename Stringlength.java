import java.util.*;
public class Stringlength
{
    public static void main(String arg []) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any String");
        String str= sc.nextLine();
        System.out.println("Entered String is"+str);
        System.out.println("Length of String is "+str.length());
        System.out.println("Length of String Excluding , and ''" +length(str));
    }
    public static int length(String s) //Calculating length of string excluding , and space
    {
        int len=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)!=',' && s.charAt(i)!=' ')
            {
                len++;
            }
        }
        return len;
    }
} 