/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursion_binary_search;

/**
 *
 * @author lima
 */
public class Recursion_Binary_Search {

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        // TODO code application logic here
BinarySearch_Recursion ob=new BinarySearch_Recursion();
int r=ob.binary_search(0, 7, 7);


if(r==1)
{
    System.out.println(" Found");
}

else
{
    System.out.println("Not Found");
}
    }
    
}
