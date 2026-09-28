
package scstring;


public class SCString {

    
    public static void main(String[] args) 
    {
        String str ="prorammer@gmail.com";
        
        int i=str.indexOf("@");
        String uname=str.substring(0,i);
        String domain=str.substring(i+1,str.length());
       
    }
    
}
