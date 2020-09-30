
package string_char_count;
import java.util.Scanner;
/**
 *
 * @author lima
 */
public class String_Char_Count {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char[] ch;
        int count=0;
        String input="nana"; 
        Scanner in=new Scanner(System.in);
        int i;
        for(i=0;i<4;i++)
        {
            if(input.charAt(i)=='a')
            {
                count++;
            }
        }
        System.out.println(count);
    }
    
}
