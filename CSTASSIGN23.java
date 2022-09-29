
package cstassign2.pkg3;

import java.util.Arrays;

public class CSTASSIGN23 {

    public static void main(String[] args) {
        String [ ]str= {"E", "V", "E", "L", "Y", "N", " "};
        String s=" ";
        String rev=" ";
        System.out.println("array: " + Arrays.toString(str));
        
        for(int i=0;i<str.length;i++) {
            if(str[i]=="  "  || i==str.length-1) {
                for(int j=s.length()-1;j>=0;j--) {
                   rev=rev+s.charAt(j);
            }
                
                System.out.println("result: " +rev);
                s=" ";
                rev=" ";
                
            }else {
                s=s+str[i];
            }
        }
    }
       
}