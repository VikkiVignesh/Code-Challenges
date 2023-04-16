/*Write a Program to find difference of two Times which is given in terms of minutes and seconds and also display the time-difference in Hours  */
import java.util.Scanner;
import java.text.DecimalFormat;
public class Time {
    public static void main(String [] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Time 1 :-  ");
        int min1=sc.nextInt();
        int sec1=sc.nextInt();
        System.out.print("Enter Time 2:- ");
        int min2=sc.nextInt();
        int sec2=sc.nextInt();
        System.out.println("Difference b/w to Times in Hours is :"+ timediff(min1, sec1, min2, sec2));
    }
    static public float timediff(int m1,int s1,int m2,int s2) {
        DecimalFormat df =new DecimalFormat();
        float min1,min2,sec1,sec2;
        min1=m1;
        min2=m2;
        sec1=s1;
        sec2=s2;
        float tmin=min1+min2;
        float tsec=(sec1/60)+(sec2/60);
        float res=tmin/60;
        System.out.println("Total - Minutes :"+tmin);
        System.out.println("TOtal Seconds "+tsec);
        System.out.println("In Minutes "+tmin+tsec);
        System.out.println("Total Time in Hours :"+ res);
        return res;
    }
}
