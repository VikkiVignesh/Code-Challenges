import java.util.Arrays;
import java.util.Scanner;

public class LargeSmallSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int arr[]=new int[sc.nextInt()];
        for(int i=0;i<arr.length;i++)
        {
            System.out.print("arr["+i+"] ");
            arr[i]=sc.nextInt();
        }
        System.out.println();
        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));
        int index=arr.length-1;
        if(arr.length%2==0)
         index=arr.length-2;

        System.out.println("Second Largest from Even Position "+arr[index]);
        System.out.println("Second smallest from odd Position "+arr[1]);
    }
}
