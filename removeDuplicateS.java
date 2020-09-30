/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package remove_duplicates_from_array;

/**
 *
 * @author lima
 */
public class removeDuplicateS {
    public static void main(String[] args) {
        int[][] ar=new int[][]{{29,1,3,4},
                {2,4,3,2},
                {2,1,3,2},
                {1,2,1,2}};
        
        int i,j,s,f2=0;
        
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                s=ar[i][j];
                
                System.out.println(s);   
                for(i=0;i<3;i++)
                {
                    for(j=0;j<3;j++)
                    {
                        System.out.println("Loop");
                        
                        if( s==ar[i][j])
                        {
                            f2++;
                            System.out.println("F2");
                        }
                        if(f2>1 && ar[i][j]==s)
                        {
                            ar[i][j]=0;
                            System.out.println("Array");
                        }
                    }
                }
                
                f2=0;
            }
        }
        
        //System.out.println("New ");
        
        /* for(i=0;i<3;i++)
    {
        for(j=0;j<3;j++)
        {
            System.out.println(ar[i][j]);       
        }
    }*/
    }
    
}
