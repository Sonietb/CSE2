//Soniet Berrios CSE2 hw04 
//Hexadecimal Converter 
// Turns integers to hexadecimal form
//Due 2/23/16
import java.util.Scanner;
public class ToHex{
 // main method required for every Java program
        public static void main(String[] args) {
    System.out.print("Please enter three numbers representing RGB values.");        
    //declaring an instance of the scanner object
    Scanner myScanner = new Scanner( System.in );
    
    int firstNum=0; //initializing the variables
    int secNum=0; //initializing the variables
    int thirdNum=0; //initializing the variables
    if (myScanner.hasNextInt()){ // checking if input is an int
        firstNum= myScanner.nextInt();
        if (myScanner.hasNextInt()){ // checking if input is an int
            secNum= myScanner.nextInt();
            if (myScanner.hasNextInt()){ // checking if input is an int
               thirdNum= myScanner.nextInt();
             }
        }
        
    if ((firstNum>0 && firstNum<255)&&(secNum>0 && secNum<255)&&(thirdNum>0 && thirdNum<255)) { // checking if inputs are within range

    
    
    int secRem1=(firstNum/16)%16; //finding remainders 
    int firstRem1= firstNum%16; //finding remainders 
    int secRem2=(secNum/16)%16; //finding remainders 
    int firstRem2= secNum%16; //finding remainders 
    int secRem3=(thirdNum/16)%16; //finding remainders 
    int firstRem3= thirdNum%16; //finding remainders 

    String hexa1= ""; //initializing the string
    
    //Converting from decimal to hexidecimal 
    switch (secRem1){
        case 0:
            hexa1 = hexa1 + "0";
        break;
        case 1:
            hexa1 = hexa1 + "1";
        break;
        case 2:
            hexa1 = hexa1 + "2";
        break;
        case 3:
            hexa1 = hexa1+ "3";
        break;
        case 4:
            hexa1 = hexa1 + "4";
        break;
        case 5:
            hexa1 = hexa1+ "5";
        break;
        case 6:
            hexa1 = hexa1+ "6";
        break;
        case 7:
            hexa1 = hexa1+ "7";
        break;
        case 8:
            hexa1 = hexa1+ "8";
        break;
        case 9:
            hexa1 = hexa1+ "9";
        break;
        case 10:
            hexa1 = hexa1+ "A";
        break;
        case 11: 
            hexa1 = hexa1+ "B";
        break;
        case 12: 
            hexa1 = hexa1+ "C";
        break;
        case 13:
            hexa1 = hexa1+ "D";
        break;
        case 14:
            hexa1 = hexa1+ "E";
        break;
        case 15:
            hexa1 = hexa1+ "F";
        break;
}
    String hexa2= ""; //initializing the string
        //Converting from decimal to hexidecimal 
    switch (firstRem1){
        case 0:
            hexa2 = hexa2 + "0";
        break;
        case 1:
            hexa2 = hexa2 + "1";
        break;
        case 2:
            hexa2 = hexa2 + "2";
        break;
        case 3:
            hexa2 = hexa2 + "3";
        break;
        case 4:
            hexa2 = hexa2 + "4";
        break;
        case 5:
            hexa2 = hexa2 + "5";
        break;
        case 6:
            hexa2 = hexa2 + "6";
        break;
        case 7:
            hexa2 = hexa2 + "7";
        break;
        case 8:
            hexa2 = hexa2 + "8";
        break;
        case 9:
            hexa2 = hexa2 + "9";
        break;
        case 10:
            hexa2 = hexa2 + "A";
        break;
        case 11:
            hexa2 = hexa2 + "B";
        break;
        case 12: 
            hexa2 = hexa2 + "C";
        break;
        case 13:
            hexa2 = hexa2 + "D";
        break;
        case 14:
            hexa2 = hexa2 + "E";
        break;
        case 15:
            hexa2 = hexa2 + "F";
        break;
}
    String hexa3= ""; //initializing the string
       //Converting from decimal to hexidecimal  
    switch (secRem2){
        case 0:
            hexa3 = hexa3 + "0";
        break;
        case 1:
            hexa3 = hexa3 + "1";
        break;
        case 2: 
            hexa3 = hexa3 + "2";
        break;
        case 3:
            hexa3 = hexa3 + "3";
        break;
        case 4:
            hexa3 = hexa3 + "4";
        break;
        case 5:
            hexa3 = hexa3 + "5";
        break;
        case 6:
            hexa3 = hexa3 + "6";
        break;
        case 7:
            hexa3 = hexa3 + "7";
        break;
        case 8:
            hexa3 = hexa3 + "8";
        break;
        case 9:
            hexa3 = hexa3 + "9";
        break;
        case 10:
            hexa3 = hexa3 + "A";
        break;
        case 11:
            hexa3 = hexa3 + "B";
        break;
        case 12: 
            hexa3 = hexa3 + "C";
        break;
        case 13:
            hexa3 = hexa3 + "D";
        break;
        case 14:
            hexa3 = hexa3 + "E";
        break;
        case 15:
            hexa3 = hexa3 + "F";
        break;
}
    String hexa4= ""; //initializing the string
        //Converting from decimal to hexidecimal 
    switch (firstRem2){
        case 0:
            hexa4 = hexa4 + "0";
        break;
        case 1:
            hexa4 = hexa4 + "1";
        break;
        case 2: 
            hexa4 = hexa4 + "2";
        break;
        case 3:
            hexa4 = hexa4 + "3";
        break;
        case 4:
            hexa4 = hexa4 + "4";
        break;
        case 5:
            hexa4 = hexa4 + "5";
        break;
        case 6:
            hexa4 = hexa4 + "6";
        break;
        case 7:
            hexa4 = hexa4 + "7";
        break;
        case 8:
            hexa4 = hexa4 + "8";
        break;
        case 9:
            hexa4 = hexa4 + "9";
        break;
        case 10:
            hexa4 = hexa4 + "A";
        break;
        case 11: 
            hexa4 = hexa4 + "B";
        break;
        case 12: 
            hexa4 = hexa4 + "C";
        break;
        case 13:
            hexa4 = hexa4 + "D";
        break;
        case 14:
            hexa4 = hexa4 + "E";
        break;
        case 15:
            hexa4 = hexa4 + "F";
        break;
}
    String hexa5= ""; //initializing the string
        //Converting from decimal to hexidecimal 
    switch (secRem3){
        case 0:
            hexa5 = hexa5 + "0";
        break;
        case 1:
            hexa5 = hexa5 + "1";
        break;
        case 2: 
            hexa5 = hexa5 + "2";
        break;
        case 3:
            hexa5 = hexa5 + "3";
        break;
        case 4:
            hexa5 = hexa5 + "4";
        break;
        case 5:
            hexa5 = hexa5 + "5";
        break;
        case 6:
            hexa5 = hexa5 + "6";
        break;
        case 7:
            hexa5 = hexa5 + "7";
        break;
        case 8:
            hexa5 = hexa5 + "8";
        break;
        case 9:
            hexa5 = hexa5 + "9";
        break;
        case 10:
            hexa5 = hexa5 + "A";
        break;
        case 11: 
            hexa5 = hexa5 + "B";
        break;
        case 12: 
            hexa5 = hexa5 + "C";
        break;
        case 13:
            hexa5 = hexa5 + "D";
        break;
        case 14:
            hexa5 = hexa5 + "E";
        break;
        case 15:
            hexa5 = hexa5 + "F";
        break;
}
    String hexa6= ""; //initializing the string
        //Converting from decimal to hexidecimal 
    switch (firstRem3){
        case 0:
            hexa6 = hexa6 + "0";
        break;
        case 1:
            hexa6 = hexa6 + "1";
        break;
        case 2: 
            hexa6 = hexa6 + "2";
        break;
        case 3:
            hexa6 = hexa6 + "3";
        break;
        case 4:
            hexa6 = hexa6 + "4";
        break;
        case 5:
            hexa6 = hexa6 + "5";
        break;
        case 6:
            hexa6 = hexa6 + "6";
        break;
        case 7:
            hexa6 = hexa6 + "7";
        break;
        case 8:
            hexa6 = hexa6 + "8";
        break;
        case 9:
            hexa6 = hexa6 + "9";
        break;
        case 10:
            hexa6 = hexa6 + "A";
        break;
        case 11: 
            hexa6 = hexa6 + "B";
        break;
        case 12: 
            hexa6 = hexa6 + "C";
        break;
        case 13:
            hexa6 = hexa6 + "D";
        break;
        case 14:
            hexa6 = hexa6 + "E";
        break;
        case 15:
            hexa6 = hexa6 + "F";
        break;
        }
    
System.out.println("The decimal numbers R:"+firstNum+", G:"+secNum+", B:"+thirdNum+", is represented in hexadecimal as:"+hexa1+hexa2+hexa3+hexa4+hexa5+hexa6); 
    } //end of if statement about range
    
    else{ // if input is not an int print this
System.out.println("Sorry, your number must be between 0-255");           
}
    
    }//end of first if statement 
    else { //if input is not withing range print this
    System.out.println("Sorry, your number must be an integer");  
    }
    

}//end of main method
}//end of class