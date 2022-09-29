
package cstassign2.pkg1;
import java.util.Arrays;
public class CSTASSIGN21 {

    public static void main(String[] args)
    {
      
        int [ ] array0 = {1, 5, -5, 2, 12, 30};
        int [ ] array1 = {-10,50,15,2};
        
       System.out.println("Array 0 :  " + Arrays.toString(array0));
       System.out.println("Array1 :  "+Arrays.toString(array1));
        
        for (int i = 0; i  < array0.length; i++)
        {
            for (int j = 0; j < array1.length; j++)
            {
            
                 if(array0[i] == (array1[j]))
                  {
            
                System.out.println("common_element  : "+(array0[i]));
                
                  }
        
        
           }
        
     }
    
    }
