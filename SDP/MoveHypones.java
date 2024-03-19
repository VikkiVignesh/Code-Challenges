
import java.util.Scanner;
public class MoveHypones {
 public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter String");
    String str=sc.nextLine();

    System.out.println(move(str));

 }  
 private static String move(String str)
 {
    StringBuilder chars=new StringBuilder();
    StringBuilder hypen=new StringBuilder();
    for(int i=0;i<str.length();i++)
    {
        char ch=str.charAt(i);
        if(ch=='-')
        {
            hypen.append(ch);
        }
        else
        {
           chars.append(ch);
        }
    }
    chars.insert(chars.length(),hypen.toString());
    return chars.toString();
 } 
}
