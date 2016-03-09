//Soniet Berrios CSE2 hw06
//Factorial Calculator
//Given an integer, this program will print out the factorial 
//Due 3/8/16
import java.util.Scanner;
public class RunFactorial{
 // main method required for every Java program
        public static void main(String[] args) {
    int fact=0;
    int counter=0;
    int ans=0;
    //declaring an instance of the scanner object
    Scanner myScanner = new Scanner( System.in );
    System.out.print("Please enter an integer that is between 9 and 16: ");
    
    while(true){ //checking to see if the input is in the correct form
     if (myScanner.hasNextInt()){ // checking if input is an int
        fact= myScanner.nextInt();
        if ((fact<=16) && (fact>=9)){ //checking if input is in the correct range 
            System.out.println("Good job! Input accepted.");
            myScanner.nextLine();
            break; //if the input is good then it leaves the while loop
        }
        else{ //if the input is not withing range this runs
        System.out.println("Dude, really? I specifically said BETWEEN 9 AND 16. Just try again.");
        myScanner.nextLine();
        }
    }
     else { //if the input is not an integer this runs
    System.out.println("Dude, really? I specifically said an INTEGER. Just try again.");
    myScanner.nextLine();
    }
 }
            counter=fact;
            ans=fact;
            while (counter>1){ //runs the info inside the loop a certain amount of times
            --counter; //decreasing the counter by one 
            ans=ans*counter;
             }
            System.out.println(fact+"!="+ans);
}//end of main method
}//end of class