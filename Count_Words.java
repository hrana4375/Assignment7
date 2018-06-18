
package assignment7;

public class Count_Words {
      public static void main(String[] args) {
     
         String str=new String("  Hello I am Himanshu");  
         str=str.trim();
         char ch[]=str.toCharArray();
         int count=0;
         int length=str.length();
         for(int i=0;i<length;i++) {
             
               
            if(ch[i]==32) 
            count++;
        
         }
           count++;

         
          
         System.out.println(count); 
    }
    
}


    

