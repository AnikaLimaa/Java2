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
public class BinarySearch_Recursion {
    
    
    int[] ar={1,3,7,10,15,16,19,24};
     
        
    int binary_search(int f,int l,int num)
    {
        int mid=(f+l)/2;
        
        if(ar[mid]==num)
        {
            System.out.println("Found!");
            return 1;
        }
        else
        {
        if(ar[mid]>num)
        {
            l=mid-1;
        }
        if(ar[mid]<num)
        {
           f= mid+1;
        }
        if(f<=l)
        {
            binary_search(f,l,num);
        }
        }
      //return -1; 
       
           return -1;
    }
}