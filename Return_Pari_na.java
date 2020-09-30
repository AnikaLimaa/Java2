/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package return_in_recursion;

/**
 *
 * @author lima
 */
public class Return_Pari_na {
    
    int i=1,n=5;
    
    int sum()
    {
        i++;
        if(i<=5)
        {
            if(i==2)
            {
                return i;
            }
            if(i==3)
            {
                return 3;
            }
            sum();
        }
        return i;
        
    }
    
}
