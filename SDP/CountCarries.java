package SDP;
import java.util.Scanner;

public class CountCarries {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1,n2;
        System.out.println("Enter 1st numbers");
        n1=sc.nextInt();
        System.out.println("Enter 2nd Number");
        n2=sc.nextInt();
        CountCarries carry=new CountCarries();
        int result=carry.calCarries(n1, n2);
       System.out.println("Total Carries "+ result);
    }

    private  int calCarries(int n,int m)
    {
        int carries=0;
        int cnt=0;
        while(n>0 || m >0)
        {
            int r1=n%10;
            int r2=m%10;
            int sum=r1+r2+carries;
            carries=sum/10;
            if(carries>0)
              cnt++;
            n/=10;
            m/=10;
   
        }
        return cnt;
     }
}