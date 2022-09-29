
package cstassign2.pkg5;

public class CSTASSIGN25 {

    public static void main(String[] args) {
       
        String myString = "madam";
        String reversedString1 = reverseString(myString);
        
        if (myString.equals(reversedString1)) {
            System.out.println( "String myString =   " + myString +  " --> True" );
        } else {
            System.out.println("String myString =  " +  myString + "-->False");
        }
        
        
        String myString2 = "evelyn";
        String reversedString2 = reverseString(myString2);
        
        if (myString2.equals(reversedString2)) {
            System.out.println("String myString2 =" + myString2 + " -->True");
        } else {
            System.out.println("String myString2 =  " + myString2 + "-->False");
        }
        
    }
    
    
    private static String reverseString(String input) {
        StringBuilder buffer = new StringBuilder();
        buffer.append(input);
        
        return buffer.reverse().toString();
    }
}
