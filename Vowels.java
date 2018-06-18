
package assignment7;

public class Vowels {
    public static void main(String args[]) {
        String str=new String("Himanshu");
        char ch[]=str.toCharArray();
       // char ch1[]=new char[ch.length];
        
        for(int i=0;i<str.length();i++) {
        
            if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u') {}
         
         else
            
                System.out.print(ch[i]+" ");
            
        }
        
    }
    
}
