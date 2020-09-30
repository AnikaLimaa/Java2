/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rectangle_position;

/**
 *
 * @author lima
 */
public class Rectangle_Position {

    /**
     * @param args the command line arguments
     */
    int a=0,l=0,r=0,b=0;
    Rectangle_Position (int atr,int atl,int bbl,int btl,int abr,int abl)
    {
        if(atr<bbl)
        {
            System.out.println("A is right of B");
        }
        else if(abr<btl)
        {
            System.out.println("A is completely left of B");
        }
    else if(bbl>abl)
    {
        System.out.println("B is above A");    
    }
    else 
    {
        System.out.println("A is above B");
    }
    }
    public static void main(String[] args) {
        // TODO code application logic here
        
        
    }
    
}
