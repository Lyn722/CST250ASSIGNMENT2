
package cstassign2.pkg2;

import java.util.Arrays;


public class CSTASSIGN22 {

    public static void main(String[] args) 
    {
        int[] array_nums = {1, 77, -5, 2, 65, 30};
        int[] array_nums2 = {-10, 50, 15, 2, 77};
        
        System.out.println("array0: "+Arrays.toString(array_nums));
         System.out.println("array1: "+Arrays.toString(array_nums2));
      
        int num1 = 65;
         int num2 = 77;
                 
         System.out.println("array0=>" +result1(array_nums, num1, num2));
         System.out.println("array1=>"+result2(array_nums2, num1, num2));
     
         
    }
   
     
    public static boolean result1(int[]array_nums , int num1, int num2){
         for(int number : array_nums) {
     
           boolean r = number != num1 && number != num2;
                if (r) {
                   
                     return true;
                }
            }         
        return false;
   
    }
    public static boolean result2(int[]array_nums2, int num1, int num2){
    

        for(int number : array_nums2) {
     
           boolean r = number != num1 && number != num2;
                if (r) {
                   
                     return true;
                }
            }         
        return false;
       
    }
    
}

