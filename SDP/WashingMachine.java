
import java.util.Scanner;

public class WashingMachine
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the  Weights ");
        int weights=sc.nextInt();

        StringBuffer str= new StringBuffer();
        str.append((weights >0 && weights<2000)?"25 Minutes"
        :(weights>=2000 && weights<=4000)? "35 Minutes"
        : (weights>= 4001 && weights<7000)?  "45 Minutes"
        :(weights >= 7000)? "Washing Machine OverLoaded"
        :"Invalid Input");
        System.out.println(str.toString());

    }
}