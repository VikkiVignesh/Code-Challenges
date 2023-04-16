import java.util.*;
public class StringMethods {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any String : "+"\s");
        String str = sc.nextLine();
        //1.String.Length()
        System.out.println("Length of "+str+" is : "+str.length());
        System.out.println("Enter the index to find the character in the str: "+"\s");
        int i=sc.nextInt();
        //2.String.charAt(int index)
        System.out.println("Character @ "+i+" is : "+str.charAt(i));
        //3.String.substring(int Start)
        System.out.println("Substring from the Index "+i+" is :"+str.substring(i));
        System.out.println("Enter the range of the string :"+"\s");
        int j=sc.nextInt();
        //4.String.substring(int start,int end)
        System.out.println("Substring() is : "+str.substring(i,j));
        //5.String.concat(String str)
        System.out.println("Concatenation func:"+str.concat(str));
        System.out.println("String is : "+str);
        //6.String.Indexof(String str)
        System.out.println("Index of the string / character in the array: "+str.indexOf(str));
        System.out.println("Enter any string to Compare : "+"\s");
        String st= sc.nextLine();
        sc.next();
        //7.String.equals(String str)
        System.out.println("Equals func : "+str.equals(st));
        //8.String.equalsIgnoreCase(String str)
        System.out.println("Comparing the String by Ignoring the case : "+str.equalsIgnoreCase(st));
        //9.String.compareTo(String str)
        System.out.println("Compare to Function : "+str.compareTo(st));
        //10.Sting.compareToIgnoreCase(String str)
        System.out.println("CompareToIgnoreCase : "+str.compareToIgnoreCase(st));
        //11.String.toLOwercase(String str)
        System.out.println(str+ " to Lower case : "+str.toLowerCase());
        //12.String.toUppercase(String str)
        System.out.println(str+" to Upper Case : "+str.toUpperCase());
        //13.String.trim()
        System.out.println("Trim function : "+str.trim());
        //14.String.replace()
        System.out.println("Replace function :"+str.replace('s', 'F'));
        System.out.println(str.replaceAll("ikk", st));
        System.out.println(str.replace(str, st));
        System.out.println(str.replaceFirst("we", st));
        System.out.println(str.resolveConstantDesc(null));
        //15.String.Codepointat(int index)
        System.out.println("Code point function : "+str.codePointAt(i));
        System.out.println("codePointBefore :"+str.codePointBefore(i));
        System.out.println("CodePointAfter : "+str.codePointCount(i, j));
    }
}
