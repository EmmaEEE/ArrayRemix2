/*
 * Emma Elliott
March 22, 2020
Array Remix 2
 */
package remixarray2;

import java.util.Scanner;
/**
 *
 * @author gregelliott
 */
public class RemixArray2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner keyedInput=new Scanner(System.in);
        
        String[]friends=new String[10];
        
        //Enter the names of 5 friends instead of 10
        System.out.println("Enter the names of five friends:");
        for (int i=0;i<=4;i=i+1)
        {
            friends[i]=keyedInput.nextLine();
        }
        //Output the names of the second, third and fourth friend entered
        System.out.println("The second, third and fourth friend entered were:");
        System.out.println("Second:" +friends[1]);
        System.out.println("Third:"+friends[2]);
        System.out.println("Fourth:"+friends[3]);
    }
    
}
