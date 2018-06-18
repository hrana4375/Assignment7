
package assignment7;

import java.util.Scanner;
public class Substrings {
    public static void main(String args[]) {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter the String");
        
        String str1=ob.nextLine();
        String str;
        
        for(int i=0;i<str1.length();i++)
        {
            for(int j=i+1;j<=str1.length();j++)
                {
                    str=str1.substring(i,j);
                    System.out.println(str);
                }
            
        }
        
        
    }
}
