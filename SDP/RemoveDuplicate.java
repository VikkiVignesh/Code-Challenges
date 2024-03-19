import java.util.Arrays;

public class RemoveDuplicate {
    public static void main(String[] args) {
        String s="Hello Wolrd!!";
        char ar[]=s.toCharArray();
        boolean[] test=new boolean[ar.length];

        for(int i=0;i<ar.length;i++)
        {
            for(int j=0;j<ar.length;j++)
            {
                if(j!=i && ar[i]==ar[j])
                {
                    test[i]=true;
                }
            }
        }

        System.out.println(Arrays.toString(test));
        System.out.println(Arrays.toString(ar));
        for(int i=0;i<test.length;i++)
        {
            if(test[i]==true)
            {
                ar[i]='$';
            }
        }

        System.out.println(s);
        System.out.println(ar);
    }
}
