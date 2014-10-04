/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assign4;

/**
 *
 * @author angel
 */
import java.util.Scanner;

public class Assign4 {

   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //initialize vairables
        int add, subract, multiply, divide;
        int selection;
        
        // for repository for MacPro
        
        // Create scanner object
        Scanner input = new Scanner(System.in);
        
        // Prompt user for inputs
        System.out.println("1 Enter 1 for Addition ");
        System.out.println("2 Enter 2 for Subtraction");
        System.out.println("3 Enter 3 for Multipllication");
        System.out.println("4 Enter 4 for Division");
        System.out.println("5 Enter 5 to Exit");
        
        selection = input.nextInt();
    
        
    }
    
}
