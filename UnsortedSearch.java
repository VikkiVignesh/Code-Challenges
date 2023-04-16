import java.util.*;
import java.util.Arrays;
public class UnsortedSearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length of array : ");
        int len=sc.nextInt();
        int arr[]=new int[len];
        System.out.println("Enter Array Elements :");
        for (int i=0;i<arr.length;i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("Entered Array");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.print("Enter the Kth smallest E;ement to find : ");
        int k=sc.nextInt();
        if(k>len)
        {
            System.out.println("Re-Enter the Element "+k+" is Out of Bound ");
            k=sc.nextInt();
        }
        System.out.println();
        System.out.println(k+"- smallest element in Array is "+findsmall(arr, k));
    }
     public  static int findsmall(int arr[],int key) {
        int temp[]=new int[arr.length];
        for(int i=0;i<arr.length;i++)
        {
            temp[i]=arr[i];
        }
        for(int i=0;i<temp.length;i++)
        {
            for (int j=i+1;j<temp.length;j++) {
                if(temp[j]<temp[i])
                {
                    int te=temp[i];
                    temp[i]=temp[j];
                    temp[j]=te;
                }
            }
        }
        System.out.println("______________________");
        for (int i=0;i>temp.length;i++) {
            System.out.print(temp[i]+" ");
        }
        return temp[key-1];
    }
}
