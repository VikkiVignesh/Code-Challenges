import java.util.Scanner;
import java.util.regex.*;;

public class PasswordValidation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Password");
        String str=sc.nextLine();

        if(validate(str))
          System.out.println("Valid Password");
        else
          System.out.println("Invalid Password");
    }

    public static boolean validate(String str)
    {
        if(str.length()==0 || !Character.isAlphabetic( str.charAt(0)))
          return false;
        else if( str.length()<4)
        {
            System.out.println("Passwaord Length Should be atleast 4");
            return false;
        }
        return Pattern.matches("^[A-Z][a-z]*+[0-9]*", str);
    }
}
