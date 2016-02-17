//Soniet Berrios CSE2 hw03 
//Due 2/16
//This program finds the volume inside a pyramid.

import java.util.Scanner;
public class Pyramid{
 // main method required for every Java program
        public static void main(String[] args) {
            
    //declaring an instance of the scanner object
    Scanner myScanner = new Scanner( System.in );
    //Telling the user to input pyramid dimensions
    System.out.print("Enter the base length of the pyramid: ");
    double pyramidLength = myScanner.nextDouble();
    System.out.print("Enter the base width of the pyramid: ");
    double pyramidWidth = myScanner.nextDouble();
    System.out.print("Enter the height of the pyramid: ");
    double pyramidHeight = myScanner.nextDouble();
    
    //Finding the volume 
    double volume= (pyramidLength*pyramidWidth*pyramidHeight)/3;
    
    System.out.println("The volume inside the pyramid is "+volume);
    
}
    }