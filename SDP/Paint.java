import java.util.Scanner;

public class Paint {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int interior,exterior;
        System.out.println("Enter Number of Interior walls");
        interior=sc.nextInt();
        System.out.println("Enter number of exterior walls");
        exterior=sc.nextInt();
        double total=0;
        if(interior!=0)
        {
           for(int i=0;i<interior;i++)
           {
            System.out.println("Enter "+(i+1)+" interior wall");
            double x=sc.nextDouble();
            total+=x*18;
           }
        }
        if(exterior!=0)
        {
            for(int i=0;i<exterior;i++)
            {
             System.out.println("Enter "+(i+1)+" exterior wall");
             double x=sc.nextDouble();
             total+=x*12;
            }
        }

        System.out.println("Total Cost "+total+ " INR");
    }
}