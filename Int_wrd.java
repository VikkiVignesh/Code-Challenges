import java.util.Scanner;

public class Int_wrd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any Number:- ");
        int num=sc.nextInt();
        System.out.println(num+" in Words is "+convert(num));
    }

    static String convert(int n)
    { String wrd="";
      String ones[]={"","one","two","three","four","five","six","seven","eight","nine"};
      String tens[]={"","","twenty","thirty","fourty","fifty","sixty","seventy","eighty","ninety"};
      String teens[]={"ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
     
      if(n>=1000)
      {
        wrd+=ones[n/1000]+" thousand ";
      }
      n=n%1000;
      if(n>=100)
      {
        wrd+=ones[n/100]+" hundred ";
      }
      n=n%100;
      if(n>=10 && n<=19)
      {
        wrd+=teens[n-10]+" ";
        n=0;
      }

      if(n>=20)
      {
        wrd+=tens[n/10]+" ";
      }
      n=n%10;
      if(n>=1 && n<=9)
      {
        wrd+=ones[n];
      }
      return wrd;
    }
}
