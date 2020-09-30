/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package string_char_count;

/**
 *
 * @author lima
 */
public class Non_Repeating_Character {
    public static void main(String[] args) {
        int i,j,c=0;
        String str="Eidel";
        for(i=0;i<str.length();i++)
        {
            char ch1=str.charAt(i);
            
            for(j=0;j<str.length();j++)
            {
                if(ch1==str.charAt(j) && (i!=j))
                {
                    c++;
                }
            }
            if(c==0)
            System.out.printf("%c frequency is %d \n",str.charAt(i),c);
            c=0;
        
        }
    }
}
