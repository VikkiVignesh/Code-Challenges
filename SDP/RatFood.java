
import java.util.Scanner;


public class RatFood {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r,unit,n;
        System.out.println("Enter the number of rats ,unit of food,and Array Size");
        r=sc.nextInt();
        unit=sc.nextInt();
        n=sc.nextInt();
        int arr[]=new int[n];

        System.out.println("Enter Array Elements");
        for(int i=0;i<n;i++)
        {
           System.out.print("arr["+i+"] :");
           arr[i]=sc.nextInt();
        }
        System.out.println();

      System.out.println("Total Number of Houses Required is "+numbHouses(arr, r, unit));

    }

    public static int numbHouses(int arr[],int r,int uni)
    {
        int req=r*uni;
        if(arr.length==0)
         return -1;
        int cnt=0;
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i];
            cnt++;
            if(sum>=req)
              {
                return cnt;
              }   
        }
        return 0;
    }
}
