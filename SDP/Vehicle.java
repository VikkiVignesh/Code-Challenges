import java.util.Scanner;

public class Vehicle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Vehicles ");
        int v=sc.nextInt();
        System.out.println("Enter Wheels ");
        int w=sc.nextInt();

        if(2>w || w%2!=0 ||v>w)
        {
            System.out.println("Invalid Inputs");
        }
        else{
            int tw=(v*4-w)/2;
            int fw=v-tw;
            System.out.println("TW = "+tw+" FW ="+fw);
        }
    }
}
