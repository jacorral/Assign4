/**
 * This application tests for knowledge in basic arithmetic functions
 * addition, subtraction, division and multiplication
 */

package assign4;

/**
 *
 * @author Jose Corral
 * 
 */
import static java.lang.StrictMath.abs;
import java.util.Scanner;

public class ArithmeticOperations {

    /**
     * @param args this application does not take any command line arguments
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

            //Doing a basic check for correct input from the user
            //if selecting an invalid choice, an error message will be printed
            if ((selection > 5) || (selection <= 0)) {
                System.out.println("Invalid number");
                System.out.println("Select again!");
               
            } else {
                //Initializing variables to be used on the rest of the app
                int select = 0;
                int count = 0;
                int correct = 0;
                int wrong = 0;
                /*Using switch, case statements for selecting the arithmetic
                operation to be performed.  A while loop is used per operation to 
                keep asking what the answer is until the value of -1 is entered to exit the
                loop.  The application can be extended to other operations by simply adding
                additional case statements and implementing the method for the desired function                
                */
                switch(selection){
                    
                    case 1: //Implementing the addition portion
                        
                        while(select != -1){
                            int firstNumber = randomNumber();
                            int secondNumber = randomNumber();
                            
                            //add(firstNumber,secondNumber);
                            System.out.println("How much is " + firstNumber + " plus " +
                                    secondNumber + "?");
                            System.out.println("Enter your answer (-1 to return to menu):");
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
                        
                    case 2: //Implementing the subtraction portion
                        
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
                            System.out.println("Enter your answer (-1 to return to menu):");
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
                        
                    case 3: //Implementing the multiplication portion
     
                        while(select != -1){
                            int firstNumber = randomNumber();
                            int secondNumber = randomNumber();
                            
                            //add(firstNumber,secondNumber);
                            System.out.println("How much is " + firstNumber + " times " +
                                    secondNumber + "?");
                            System.out.println("Enter your answer (-1 to return to menu):");
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
                        
                        
                    case 4: //Implementing the division portion
                    
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
                            System.out.println("Enter your answer, up to two decimal places" +
                                    "(example: 12.34 or enter -1 to return to menu):");
                            double answer = input.nextDouble();
                            select = (int)answer;
                            if(answer == -1){
                                break;
                            }
                            // The accuracy of the division needs to be up to
                            // two decimal places or 1/100
                            else if(abs(answer - divide(firstNumber,secondNumber))< 0.01){
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
    * Method that divides two integer numbers and returns 
    * a double
    */
    public static double divide(int a, int b) {
        double div =  a /(1.0*b);
        return div;
    }

}