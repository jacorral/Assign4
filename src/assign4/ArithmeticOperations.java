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

        int selection = 0;
        Scanner input = new Scanner(System.in);

       

        while (selection != 5) {
            
            //Printing menu
            printMenu();
            selection = input.nextInt();

            if ((selection > 5) || (selection <= 0)) {
                System.out.println("Invalid number");
                System.out.println("Select again!");
               
            } else {
                int select = 0;
                int count = 0;
                int correct = 0;
                int wrong = 0;
                switch(selection){
                    case 1: 
                        
                        while(select != -1){
                            int firstNumber = randomNumber();
                            int secondNumber = randomNumber();
                            
                            //add(firstNumber,secondNumber);
                            System.out.println("How much is " + firstNumber + " plus " +
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
                                System.out.println("Wrong.  Please try again");
                                wrong++;
                            }
                            count++;
                        }
                    System.out.println("Addition problems played: " + count);
                    System.out.println("Number of correct answers: " + correct);
                    System.out.println("Number of wrong answers: " + wrong);
                    System.out.println();
                    break;    
                        
                    case 2: 
                        
                        while(select != -1){
                            int firstNumber = randomNumber();
                            int secondNumber = randomNumber();
                            
                            //add(firstNumber,secondNumber);
                            if (firstNumber < secondNumber){
                                int temp = secondNumber;
                                secondNumber = firstNumber;
                                firstNumber = temp;
                            }
                            
                            System.out.println("How much is " + firstNumber + " minus "
                                    + " " +
                                    secondNumber + "?");
                            System.out.println("Enter your answer (-1 to return to menu)");
                            int answer = input.nextInt();
                            select = answer;
                            if(answer == -1){
                                break;
                            }
                            else if(answer == subtract(firstNumber,secondNumber)){
                                System.out.println("Very Good!");
                                correct++;
                            }else{
                                System.out.println("Wrong.  Please try again");
                                wrong++;
                            }
                            count++;
                        }
                    System.out.println("Subtraction problems played: " + count);
                    System.out.println("Number of correct answers: " + correct);
                    System.out.println("Number of wrong answers: " + wrong);
                    System.out.println();
                    break;
                        
                    case 3: 
     
                        while(select != -1){
                            int firstNumber = randomNumber();
                            int secondNumber = randomNumber();
                            
                            //add(firstNumber,secondNumber);
                            System.out.println("How much is " + firstNumber + " times " +
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
                                System.out.println("Wrong.  Please try again");
                                wrong++;
                            }
                            count++;
                        }
                    System.out.println("Multiplication problems played: " + count);
                    System.out.println("Number of correct answers: " + correct);
                    System.out.println("Number of wrong answers: " + wrong);
                    System.out.println();
                    break;
                        
                        
                    case 4: 
                    
                         while(select != -1){
                            int firstNumber = randomNumber();
                            int secondNumber = randomNumber();
                            
                            if (secondNumber == 0){
                                System.out.println("Cannot divide by zero");
                                break;
                            }
                            
                            //add(firstNumber,secondNumber);
                            System.out.println("How much is " + firstNumber + " divided " +
                                    secondNumber + "?");
                            System.out.println("Enter your answer (-1 to return to menu)");
                            double answer = input.nextDouble();
                            select = (int)answer;
                            if(answer == -1){
                                break;
                            }
                            else if(answer == divide(firstNumber,secondNumber)){
                                System.out.println("Very Good!");
                                correct++;
                            }else{
                                System.out.println("Wrong.  Please try again");
                                wrong++;
                            }
                            count++;
                        }
                    System.out.println("Division problems played: " + count);
                    System.out.println("Number of correct answers: " + correct);
                    System.out.println("Number of wrong answers: " + wrong);
                    System.out.println();
                    break;
                }
            }
        }
    }
    

    /**
     * Method to print the main Menu
     */
    public static void printMenu() {
        System.out.println("******Welcome to the Arithmetic quiz********");
        System.out.println("\nMENU: \n");
        System.out.println(" Enter 1 for Addition ");
        System.out.println(" Enter 2 for Subtraction");
        System.out.println(" Enter 3 for Multipllication");
        System.out.println(" Enter 4 for Division");
        System.out.println(" Enter 5 to Exit");
        System.out.println();

    }

    
    /**
     * 
     * Method that generates a random integer number between 0 and 99
     * 
     */
    public static int randomNumber() {
        int number = (int) (Math.random() * 100);
        return number;
    }

    
    /**
     * 
     * Method that adds two integer numbers 
     * 
     */
    public static int add(int a, int b) {
        int sum = a + b;

        return sum;
    }

    /**
    * Method that subtracts two integer number
    */
    public static int subtract(int a, int b) {
        int subtract = a - b;
        return subtract;
    }

    /**
    * Method that multiplies two integer numbers 
    * 
    */
    public static int multiply(int a, int b) {
        int times = a * b;
        return times;
    }

    /**
    * Method that divides to integer numbers and returns 
    * a double
    */
    public static double divide(int a, int b) {
        double div =  a /(1.0*b);
        return div;
    }

}
