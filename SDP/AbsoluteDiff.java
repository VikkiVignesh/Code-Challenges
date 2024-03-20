import java.util.Scanner;

public class AbsoluteDiff {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Diff");
        int diff=sc.nextInt();
        System.out.println("Enter the num to subtract");
        int num=sc.nextInt();

        int arr[]={12,3,14,56,77,13};


        int cnt=0;
        for(int i=0;i<arr.length;i++)
        {
            if(Math.abs(num - arr[i])<=2)
             cnt++;
        }
        System.out.println(cnt);
    }
}
