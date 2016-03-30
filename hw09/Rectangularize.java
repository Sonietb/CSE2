/* Soniet Berrios CSE2 hw09
This program will let the user choose from three different games to play.
*/
import java.util.Scanner;
public class Rectangularize{
    public static void main(String[] args){
    Scanner myScanner = new Scanner(System.in);
    String inputString="";
    int inputInt=0;
    
    System.out.print("Enter a word or an integer: ");
    
    if(myScanner.hasNextInt()){
        inputInt= myScanner.nextInt();
        rect(inputInt);
    }
    else{
      inputString=myScanner.next();
      rect(inputString);
    }
  
    }
    
    public static void rect(String input){
    int n=input.length();
    for(int a=0;a<n;a++){
        System.out.println(input);
    }
    
    }
    
        
    public static void rect(int input){
        for(int a=0; a<input; a++){
            for(int b=0; b<input; b++){
                System.out.print("%");
            }
        System.out.println();
        }
    }
}