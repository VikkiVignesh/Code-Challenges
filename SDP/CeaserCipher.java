import java.util.Scanner;

public class CeaserCipher {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //char data[]={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        System.out.println("Enter String to encrypt");
        String s=sc.nextLine();
        System.out.println("Enter the Shift Key");
        int k=sc.nextInt();
       System.out.println("Encrypted Text "+encrypt(s, k));
    }

    public static String encrypt(String str,int k)
    {
        String msg=" ";
        if(k<=0)
         return str;
        for(int i=0;i<str.length();i++)
        {
            char c=(char) (str.charAt(i)+k);
            msg+=c;
        }
        return msg;
    }
}
