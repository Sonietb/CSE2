import java.util.Scanner;
public class Twisty {
    // main method required for every Java program
    public static void main(String[] args) {
        //declaring an instance of the scanner object
        Scanner myScanner = new Scanner(System.in);

        int length = 0;
        int width = 0;

        while (true) { //checking to see if the input is in the correct form
            System.out.print("Input your desired length: ");
            if (myScanner.hasNextInt()) { // checking if input is an int
                length = myScanner.nextInt();
                if (length < 80) { //checking to see if length is less than 80
                    break;
                }
                else { //if the length is bigger than 80 this runs
                    System.out.println("Error: Please input an integer smaller than 80.");
                    myScanner.nextLine();
                }
            }
            else { //if the input is not an integer this runs
                System.out.println("Error: please type in an integer.");
                myScanner.nextLine();
            }
        }

        while (true) { //checking to see if the input is in the correct form
            System.out.print("Input your desired width: ");
            if (myScanner.hasNextInt()) { // checking if input is an int
                width = myScanner.nextInt();
                if (width < length) { //checking to see if width is less than length
                    break;
                }
                else { //if the width is bigger this runs
                    System.out.println("Error: Please input an integer smaller than the length.");
                    myScanner.nextLine();
                }
            }
            else { //if the input is not an integer this runs
                System.out.println("Error: please type in an integer.");
                myScanner.nextLine();
            }
        }
        int j = 0;
        for (int i = 0; i < width; i++) {
            for (j = 0; j < length; j++) {
                if (j / width % 2 == 0) {
                    if (i == j % width) {
                        System.out.print("#");
                    }
                    else if (width - 1 - i == j % width) {
                        System.out.print("/");
                    }
                    else {
                        System.out.print(" ");
                    }
                }
                else{
                    if (i == j % width) {
                        System.out.print("\\");
                    }
                    else if (width - 1 - i == j % width) {
                        System.out.print("#");
                    }
                    else {
                        System.out.print(" ");
                    }
                    
                }
            }
            System.out.println();
        }





    }
}