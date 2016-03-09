//Soniet Berrios CSE2 hw06
//Fibonacci Calculator
//Given two integers, this program will print the next n numbers in the sequence 
//Due 3/8/16
import java.util.Scanner;
public class Fibonacci{
 // main method required for every Java program
        public static void main(String[] args) {
    //declaring an instance of the scanner object
    Scanner myScanner = new Scanner( System.in );
    
    int firstNum=0;
    int secNum=0;
    int fibNum=0;
    int a=1,d=0;
    
     while(true){ //checking to see if the input is in the correct form
     System.out.print("Enter the first number in the sequence: ");
     if (myScanner.hasNextInt()){ // checking if input is an int
     firstNum= myScanner.nextInt();
        if (firstNum>0){ //checking to see if input is postive
            break;
        }
        else{ //if the input is not positve this runs
        System.out.println("Sorry, the number must be positive.");
        myScanner.nextLine();
        }
    }
     else { //if the input is not an integer this runs
    System.out.println("Sorry, the number must be an integer.");
    myScanner.nextLine();
  
    }
 }
 
      while(true){ //checking to see if the input is in the correct form
     System.out.print("Enter the second number in the sequence: ");
     if (myScanner.hasNextInt()){ // checking if input is an int
     secNum= myScanner.nextInt();
        if (secNum>0){ //checking to see if input is postive
            break;
        }
        else{ //if the input is not positve this runs
        System.out.println("Sorry, the number must be positive.");
        myScanner.nextLine();
        }
    }
     else { //if the input is not an integer this runs
    System.out.println("Sorry, the number must be an integer.");
    myScanner.nextLine();
    }
 }

      while(true){ //checking to see if the input is in the correct form
    System.out.print("How many custom Fibonacci numbers should be printed? ");
     if (myScanner.hasNextInt()){ // checking if input is an int
     fibNum= myScanner.nextInt();
        if (fibNum>0){ //checking to see if input is postive
            break;
        }
        else{ //if the input is not positve this runs
        System.out.println("Sorry, the number must be positive.");
        myScanner.nextLine();
        }
    }
     else { //if the input is not an integer this runs
    System.out.println("Sorry, the number must be an integer.");
    myScanner.nextLine();
    }
 }
    System.out.println("The numbers are:");
    System.out.print(firstNum); 
    
    while (a<=fibNum){
     System.out.print(","+secNum);
     d=firstNum+secNum;
     firstNum=secNum;
     secNum=d;
     a=a+1; //incrementing 
     
    }
  System.out.print(".");
  System.out.println();



}//end of main method
}//end of class