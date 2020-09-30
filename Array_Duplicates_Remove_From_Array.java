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
public class Array_Duplicates_Remove_From_Array {
    public static void main(String[] args) {
        int i,j,s,i1,j1;
        int[][] ar=new int[][]{
            {1,2,3},
            {2,1,4},
            {3,4,8} };
        
        int[][] ar1=new int[][]{
            {1,2,3},
            {2,1,4},
            {3,4,8} };
        
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                s=ar[i][j];
                System.out.println("S :");
                System.out.println(s);
                for(j1=i+1;j1<3;j1++)
                {
                    for(i1=0;i1<3;i1++)
                    {
                       if(ar[j1][i1]-s==0)
                       {
                           ar1[j1][i1]=0;
                       }
                    }
                }
            }
        }
        System.out.println("Out Of Loop");
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                System.out.println(ar1[i][j]);
            }
        }
    }
}
