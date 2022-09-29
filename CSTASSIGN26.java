
package cstassign2.pkg6;

public class CSTASSIGN26 {

    public static void main(String[] args) {
      
       String s1 = "hello everyone." ;
        String s2 = "let's write some useful Java code today." ;
            String s3 =  "we will begin with strings. "  ;
            
          String result = s1.substring(0, 1).toUpperCase() + s1.substring(1) + 
                  s2.substring(0, 1).toUpperCase() + s2.substring(1)+ 
                  s3.substring(0, 1).toUpperCase() + s3.substring(1);
          System.out.println("String text = " + (s1) + (s2 ) + (s3)  +
                  " --> " + (result) );
            
    
}
