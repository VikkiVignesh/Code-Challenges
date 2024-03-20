import java.util.Scanner;

public class DifferemceSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,m;
        System.out.println("Enter n Value");
        n=sc.nextInt();
        System.out.println("Enter m values");
        m=sc.nextInt();
        int arr[]=new int[m];
        for(int i=0;i<m;i++)
        {
            System.out.print("arr["+i+"]");
            arr[i]=sc.nextInt();
        }

        int sum=0,total=0;
        for(int i=0;i<m;i++)
        { total+=arr[i];
            if(arr[i]%n==0)
             sum+=arr[i];
        }
        
    
        int rem=total-sum;

        System.out.println("Divisible by n  "+sum);
        System.out.println("Total sum  "+total);
        System.out.println("Non Divided values sum  "+rem);

        System.out.println("Divisible - Non Divisible :"+Math.abs(sum-rem));
    }
}
