
import java.util.Scanner;

public class Fit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of Rounds");
        int n=sc.nextInt();
        int i=0;
        float r1=0,r2=0,r3=0;
        int arr[][]=new int[n][3];
        while(i!=n)
        {
            System.out.println("Enter Round "+(i+1)+" data");
            System.out.println("Trainee 1");
            int d1=sc.nextInt();
            System.out.println("Trainee 2");
            int d2=sc.nextInt();
            System.out.println("Trainee 3");
            int d3=sc.nextInt();
            arr[i][0]=d1;
            arr[i][1]=d2;
            arr[i][2]=d3;
            i++;
        }
        
        r1=avg(arr[0], arr[0].length);
        r2=avg(arr[1], arr[1].length);
        r3=avg(arr[2],arr[2].length);
        System.out.println("Round 1 "+r1);
        System.out.println("Round 2 "+r1);
        System.out.println("Round 3 "+r1);
      if(r1>r2 && r1>r3)
        System.out.println(r1+"is Greater");
      else if(r2>r3)
      {
        System.out.println(r2+"is Greater");
      }
      else
      {
        System.out.println(r3+"is Greater");
      }

        }

        public static float avg(int a[],float n)
        {
            int res=0;
            for(int i=0;i<a.length;i++)
            {
                res+=a[i];
            }
            return res/n;
        }
    
}
