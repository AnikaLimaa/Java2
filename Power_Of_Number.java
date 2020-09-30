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
public class Power_Of_Number {

    /**
     * @param args the command line arguments
     */
    int num;
    
    public static void main(String[] args) {
        // TODO code application logic here
       power_finding obj=new power_finding();
       int power=obj.pow();
        System.out.println(power);
        
    }
    
}
