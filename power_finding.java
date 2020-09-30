/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package power_of_number;

/**
 *
 * @author lima
 */

public class power_finding {
    int num=2;
    int power=4;
    int i=1;
    int m=1;
int pow()
    {
        if(i<=6)
        {
            m=m*num;
            i++;
            pow();
        }
        return m;
    }
}
