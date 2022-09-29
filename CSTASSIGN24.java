
package cstassign2.pkg4;

import java.util.HashSet;
import java.util.Scanner;


public class CSTASSIGN24 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
             String input = scanner.nextLine();
             checkUnique(input);
    }
    private static void checkUnique(String input) {
     boolean result = false;
          HashSet<Character> set = new HashSet<>();
          for (int i =0 ;i < input.length() ;i++) {
             result = set.add(input.charAt (i));
                   if(result==false)
                     break;
}
        
        System.out.println(result);
        
        
        
    }
    
}
