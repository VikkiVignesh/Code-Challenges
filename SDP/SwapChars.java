import java.util.Arrays;
import java.util.Scanner;

public class SwapChars {
    public static void main(String[] args) {
        String s="we are reva students";
        char arr[]=s.toCharArray();
        System.out.println(Arrays.toString(arr));

        int f=0;
        for(int i=0;i<arr.length;i++)
        {
          if(i==0 && arr[i]!=' ' || arr[i]!=' '&& arr[i-1]==' ')
          {
              System.out.println(arr[i]);
              f=i;
          }
          if(i==arr.length-1 && arr[i]!=' '||arr[i]!=' ' && arr[i+1]==' ')
          {
            System.out.println(arr[i]);
            char temp=arr[i];
            arr[i]=arr[f];
            arr[f]=temp;
          }
        }

        System.out.println(arr);
    }
}
