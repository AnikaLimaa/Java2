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
public class Character_Count {
    public static void main(String[] args)
    {
        String str="ddhojohoj";
        
        int i,j,c=1;
        
        for(i=0;i<str.length();i++)
        {
            char ch1=str.charAt(i);
            c=1;
            for(j=0;j<str.length();j++)
            {
                
                if(str.charAt(j)==ch1)
                {
                    c++;
                }
            }
            
            System.out.printf("%c Frequency %d",ch1,c-1);
            
             System.out.printf(" \n");
        }
    }
}
