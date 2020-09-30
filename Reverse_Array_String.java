/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reverse_array_string;

/**
 *
 * @author lima
 */
public class Reverse_Array_String {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    String mine="hey ya";
    String str;
    char[] ch=new char[10];
    char[] ch1=new char[10];
    
    int len=mine.length();
    int i,j=0;
    for(i=len-1;i>=0;i--)
    {
        ch.charAt(j)=mine.charAt(i);
        j++;
    }
    
    }
    
}
