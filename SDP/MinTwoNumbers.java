import java.util.Arrays;
import java.util.Scanner;

public class MinTwoNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]={6,8,4,5,2,3};
        int n=arr.length;
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));

        int n1=0,n2=0;
        for(int i=0;i<n;i++)
        {
            if(i%2==0)
            {
                n1=n1*10+arr[i];
                System.out.println(n1);
            }
          else
            {
                n2=n2*10+arr[i];
                System.out.println(n2);
            }
        }

        System.out.println("1st Minimum "+n1);
        System.out.println("2nd Minimum "+n2);
    }
}
