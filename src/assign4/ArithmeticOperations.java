/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assign4;

/**
 *
 * @author Jose Coral
 */
import java.util.Scanner;

public class ArithmeticOperations {

    /**
     * @param args the command line arguments
     *
     */
    public static void main(String[] args) {
        //initialize vairables
        int sum, subract, multiply, divide;
        int selection;

        // for repository for MacPro
        // Create scanner object
        Scanner input = new Scanner(System.in);

        System.out.println("******Welcome to the Arithmetic quiz********");

       // printMenu();

        selection = 0;

        while (selection != 5) {
            
            printMenu();
            selection = input.nextInt();

            if ((selection > 5) || (selection <= 0)) {
                System.out.println("Invalid number");
                System.out.println("Select again!");
                selection = input.nextInt();
            } else {
                //int firstNumber = randomNumber();
                //int secondNumber = randomNumber();
                System.out.println("You choose " + selection);
                int select = 0;
                int count = 0;
                int correct = 0;
                int wrong = 0;
                switch(selection){
                    case 1: System.out.println("1 Addition");
                        
                        while(select != -1){
                            int firstNumber = randomNumber();
                            int secondNumber = randomNumber();
                            
                            //add(firstNumber,secondNumber);
                            System.out.println("How much is " + firstNumber + " + " +
                                    secondNumber + "?");
                            System.out.println("Enter your answer (-1 to return to menu)");
                            int answer = input.nextInt();
                            select = answer;
                            if(answer == -1){
                                break;
                            }
                            else if(answer == add(firstNumber,secondNumber)){
                                System.out.println("Very Good!");
                                correct++;
                            }else{
                                System.out.println("No.  Please try again");
                                wrong++;
                            }
                            count++;
                        }
                    System.out.println("Addition problems played: " + count);
                    System.out.println("Number of correct answers: " + correct);
                    System.out.println("Number of wrong answers: " + wrong);
                    System.out.println();
                    break;    
                        
                    case 2: System.out.println("2 Subtraction");
                    case 3: System.out.println("3 Multiplication");
     
                        while(select != -1){
                            int firstNumber = randomNumber();
                            int secondNumber = randomNumber();
                            
                            //add(firstNumber,secondNumber);
                            System.out.println("How much is " + firstNumber + " X " +
                                    secondNumber + "?");
                            System.out.println("Enter your answer (-1 to return to menu)");
                            int answer = input.nextInt();
                            select = answer;
                            if(answer == -1){
                                break;
                            }
                            else if(answer == multiply(firstNumber,secondNumber)){
                                System.out.println("Very Good!");
                                correct++;
                            }else{
                                System.out.println("No.  Please try again");
                                wrong++;
                            }
                            count++;
                        }
                    System.out.println("Multiplication problems played: " + count);
                    System.out.println("Number of correct answers: " + correct);
                    System.out.println("Number of wrong answers: " + wrong);
                    System.out.println();
                    break;
                        
                        
                    case 4: System.out.println("4 Division");
                }
                        
               // break;
            }
        }

    }

    public static void printMenu() {
        System.out.println("1 Enter 1 for Addition ");
        System.out.println("2 Enter 2 for Subtraction");
        System.out.println("3 Enter 3 for Multipllication");
        System.out.println("4 Enter 4 for Division");
        System.out.println("5 Enter 5 to Exit");
        System.out.println();

    }

    public static int randomNumber() {
        int number = (int) (Math.random() * 100);
        return number;
    }

    public static int add(int a, int b) {
        int sum = a + b;

        return sum;
    }

    public static int subtract(int a, int b) {
        int subtract = a - b;
        return subtract;
    }

    public static int multiply(int a, int b) {
        int times = a * b;
        return times;
    }

    public static double divide(int a, int b) {
        int div = (int) (a / b);
        return div;
    }

}
