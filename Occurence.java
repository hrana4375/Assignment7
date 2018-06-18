
package assignment7;

import java.util.Scanner;
public class Occurence {
    public static void main(String args[]) {
        Scanner ob=new Scanner(System.in);
        int count=0;
        int len1,len2;
        System.out.println("Enter String 1 and String 2");
        String str1=ob.nextLine();
        String str2=ob.nextLine();
        String str3;
        
        len1=str1.length();
        len2=str2.length();
        
        for(int i=0;i<=len1-len2;i++)
        {
            str3=str1.substring(i,i+len2);
            if(str3.equals(str2))
                count++;
        }
        System.out.println(count);
        
        
        
        
       
    }
}
    
  