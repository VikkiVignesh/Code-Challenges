import java.util.*;
public class AlterAlpha {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any String");
        String str=sc.nextLine();
        System.out.println("Original String "+str);
        
        char c[]=str.toCharArray();
        for (int i=0;i<str.length();i++) {
         if(i%2==0)
           c[i]=Character.toUpperCase(c[i]);
         else
          c[i]=Character.toLowerCase(c[i]);
        }
        String res=new String(c);
        System.out.println(res);
    }
}
