import java.util.Scanner;
/**
 *This program will print out a line of * that is the size of the entered number 
 * @author Sevde
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create a Scanner for user input 
    Scanner input = new Scanner(System.in);
    // ask the user for a number between 
    System.out.println("Please enter a number between 1 and 10");
    int userNumber = input.nextInt();
    for( int count = 1; count <= userNumber; count = count + 1){
     
      System.out.print("*");
      
      
    }

    
  }
}
