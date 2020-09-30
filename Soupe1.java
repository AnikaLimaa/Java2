/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package superkeypractise;

/**
 *
 * @author lima
 */
public class Soupe1 extends Soupe{
    String s1;
    Soupe1(String s,String s2,String s3)
    {
         super(s2,s3);
         s1=s;
    }
    
    void print()
    {
        super.print();
        System.out.println(s1);
    }
}
