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
public class This {
    String s1;
    int a;
     static final int b;
   /* This(String s1,int a)
    {
        this.s1=s1;
        this.a=a;
    }*/
    void msg()
    {
        System.out.println("In Message");
    }
    void print()
    {
        this. msg();
        System.out.println(s1);
        System.out.println(a);
    }
}
