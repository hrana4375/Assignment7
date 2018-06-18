
package assignment7;


public class Reverse {

    
    public static void main(String[] args) {
        String str1=new String("Himanshu");
        char a[]=str1.toCharArray();
        int length=a.length;
        
        char a1[]=new char[length];
        
        int j=length-1;
        for(int i=0;i<length;i++)   {
            while(j>=0) {
                
                a1[i]=a[j];
                j--;
                break;
                
            }
                
        }
        for(int i=0;i<length;i++)
        System.out.print(a1[i]+" ");
        
       
    }
    
}
