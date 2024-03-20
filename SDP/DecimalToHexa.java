import java.util.Scanner;

public class DecimalToHexa {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n value");
        int n=sc.nextInt();
        System.out.println("Eneter num value");
        int num=sc.nextInt();
        DecimalToHexa hexa=new DecimalToHexa();
        String res=hexa.convert(n, num);
        System.out.println("Hexa Decimal Value : "+res);
        
    }
    private String convert(int n,int num)
    {
        if(n<0 || n>36)
         return "Invalid Number";
        StringBuilder res=new StringBuilder();
        while(num>0)
        {
            int rem=num%n;
            res.insert(0,getchar(rem));
            num/=n;
        }
        return res.toString();
    }

    private char getchar(int rem)
    {
        if(rem>9)
         return (char)(rem-9+64);
        else
         return (char) (rem+'0');
    }
}
