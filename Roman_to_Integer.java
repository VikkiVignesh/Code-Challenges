import java.util.*;
import java.io.*;
public class Roman_to_Integer
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    System.out.println("Enter any Roman Number");
    String roman=sc.next();
    int num=number(roman);
    System.out.println("Roman Number"+roman+" is equals to "+num);
    }

    public static int number(String s)
    {
        Map<Character,Integer> map=new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        int res=0;
        for(int i=0;i<s.length();i++)
        {
            int currnum=map.get(s.charAt(i));
            if((i+1)<s.length())
            {
                int nextnum=map.get(s.charAt(i+1));
                if(nextnum>currnum)
                {
                    res-=currnum;
                }
                else
                {
                  res+=currnum;
                }
                
            }
            else
             res+=currnum;
        }
        return res;
    }

}