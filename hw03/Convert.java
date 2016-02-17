//Soniet Berrios CSE2 hw03 
//Due 2/16
//This program converts meters to inches 

import java.util.Scanner;
public class Convert{
 // main method required for every Java program
        public static void main(String[] args) {
            
    //declaring an instance of the scanner object
    Scanner myScanner = new Scanner( System.in );
    //Teling the user to input meters
    System.out.print("Enter the distance in meters: ");
    double distanceMeters = myScanner.nextDouble();
    // Converting from meters to inches 
    double distanceInches =  distanceMeters/.0254;

    
    System.out.println(distanceMeters+" meters is "+(double) ((int) (distanceInches*10000))/10000+" inches.");
    
}
    }