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
import java.util.Scanner;
public class Remove_DuplicateS_From_Array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int[][] ar=new int[][]{{1,1,3,4},
                {2,4,3,2},
                {2,1,3,2},
                {1,2,1,2}};
        int i,j=0,k=1,s1,s2=0;
        int[] arr=new int[5];
        /*for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                System.out.printf("array[%d][%d] :\n",i,j);
            Scanner in=new Scanner(System.in);
             ar[i][j]=in.nextInt();
            }
           
        }*/
        int k1=0,i1,j1,f=0;
        //for(i=0;i<3;i++)
        /*{ 
            for(j=0;j<3;j++)
            
            {  int s=ar[i][j];
            
            for(i1=0;i1<3;i1++)
                for(j1=0;j1<3;j1++)
                if(ar[i1][j1]==s )
                {
                    arr[k1]=ar[i][j];
                    System.out.println(ar[i][j]);
                    k1++;
                }
            }
        }*/
            
          while(true)
          {
              if(s2==4)
              {
                  break;
              }
            for(i=0;i<3;i++)
            {
                for(j=0;j<3;j++)
                {
                    f++;
                    
                    if(k==ar[i][j] && f>1)
                    {
                        arr[k]=k;
                        
                        
                    }
                   if (i==2 && j==2)
                   {
                       s2++;
                   }
                }
                
            }
            k++;
            f=0;
            
            
          }
          
          for(i=1;i<=4;i++)
          {
              System.out.println(arr[i]);
          }
          k=1;
          int f1=0;
          while(true)
          { if(k==5)
          {
              break;
          }
          for(i=0;i<3;i++)
          {
              for(j=0;j<3;j++)
              {
                  f1++;
                  if(arr[k]==ar[i][j] && f1>1)
                  {
                      ar[i][j]=0;
                  }
              }
          }
          f1=0;
          k++;
          }
          System.out.println("New : ");
          for(i=0;i<3;i++)
          {
              for(j=0;j<3;j++)
              {
                  System.out.println(ar[i][j]);
              }
          }
        
    }
    
}
