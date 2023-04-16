/*
Write a Java Program to build a  Arthimatic calculator ,and which should generate of 2 decimal point result
*/
import java.util.*;
import java.lang.Exception;
public class AirthCalc {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any two numbers ");
        float a=sc.nextFloat();
        float b=sc.nextFloat();
        System.out.println("Enter any opertor :");
        char ch=sc.next().charAt(0);
        doble res=clac(a, b, ch);
        String str= String.format("%.2f",res);
       System.out.println(ch+" of "+a+" "+b+" is "+str);
    }
    public static  double clac(float a,float b,char c) {
        double res=0;
        switch (c) {
            case '+':
                res=a+b;
                break;
            case '-':
                res=a-b;
                break;
            case '*':
                res=a*b;
                break;
            case '/':
            if(b==0)
            {
               try {
                  res=a/b;
               } catch (Exception e) {
                System.out.println(e);
               }
            }
                res=a/b;
                break;
            case '%':
                res=a%b;
                break;
        
            default:
                break;
        }
        return res;
    }
}
