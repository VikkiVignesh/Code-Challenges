import java.util.Scanner;

public class CharSwaps {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char ch1,ch2;
        System.out.println("Enter String ");
        String str=sc.nextLine();
        System.out.println("Enter ch1");
        ch1=sc.next().charAt(0);
        System.out.println("Enter ch2");
        ch2=sc.next().charAt(0);

        char arr[]=str.toCharArray();
        System.out.println(arr);
        if(ch1!=ch2)
        {
            CharSwaps swap=new CharSwaps();
            swap.replace(arr, ch1, ch2);
       System.out.println(arr);
        }
        else
           System.out.println(arr);

    }
    private void replace(char ar[],char a,char b)
    {
        for(int i=0;i<ar.length;i++)
        {
           if(ar[i]==a)
             ar[i]=b;
           else if(ar[i]==b)
             ar[i]=a;
        }
    }
}
