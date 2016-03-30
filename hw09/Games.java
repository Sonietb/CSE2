/* Soniet Berrios CSE2 hw09
This program will let the user choose from three different games to play.
*/

import java.util.Scanner; //importing the scanner method
public class Games{//
    public static void main(String[] args){ //beginning of main method
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Welcome to Sunny Game Center!");
        System.out.println("We have three mini games available: guessTheBox, spinTheWheel,and scrambler");
        System.out.print("Please enter the name of the game you would like to play:");  //asking the user what game they want
        
        String g1="guessTheBox";
        String g2="spinTheWheel";
        String g3="scrambler";
        
        String s=myScanner.nextLine();
        if (s.equals(g1)){ //checking to see if the input is guessTheBox
        guessTheBox(); //calls this method
        }
        else if (s.equals(g2)){ //checking to see if the input is spinTheWheel
        spinTheWheel();  //calls this method
        }
        else if (s.equals(g3)){ //checking to see if the input is scrambler
        scrambler();   //calls this method
        }
        else{ //if they dont pick any of the games
            System.out.println("Sorry, Sunny Game Center does not have that game.");
        }
    }//end of main method
    
    /*The first game guessTheBox is in its own method. Once called upon it asks the user for input
    and if the input is the same as the random number generated the user wins the game!
    */
    public static void guessTheBox(){
    Scanner myScanner = new Scanner(System.in);
    String guess=""; //initializing guess
        while(true){ //loops until the user puts in the right input 
            System.out.print("Please enter your guess of 1,2, or 3.");  //asks the user for input
            guess=myScanner.nextLine(); //saves the input
            if(guess.equals("1") || guess.equals("2") || guess.equals("3")){ //checking to see if input is 1,2, or 3
            System.out.println(guess);
            break; //leaves while loop
            }
            else{ //if they dont insert the right input
            System.out.println("Error: please type in 1,2, or 3.");
            }
        }
        
        int box=(int)(Math.random()*3); //generates a random number
        String winner=""; //initializing winner
        switch(box){ //picking a winning number based on the random number generated
            case 0:
            winner="1";
            break;
            case 1:
            winner="2";
            break;
            case 2:
            winner="3";
            break;
        }
        if (winner.equals(guess)){  //checking to see if the user guessed the right number
            System.out.println("Wow omg you're so good you win brownie points.");
        }
        else{   //if they didnt pick the right number then this prints
            System.out.println("No prize for you.");
        }
        
    } //end of guessTheBox method
    
    /*The second game is spinTheWheel. When this method is called the user has to guess where the wheel will land
    and if they guess correctly they win. Where the wheel will land is determined by random numbers and switch statements.
    */
    public static void spinTheWheel(){
        Scanner myScanner = new Scanner(System.in);
        String color=""; //initializing color
        int num=0;  //initializing num
        System.out.println("You must input a number between 1-5 and a color(red or black). For example black 2"); 
        String guess=""; //initializing guess
        while (true){ //loops until user input is correct 
        System.out.print("What is your guess?"); //asking for input
        guess=myScanner.nextLine(); //saving user input as guess
            if(guess.equalsIgnoreCase("black 1") || guess.equalsIgnoreCase("black 2")
            || guess.equalsIgnoreCase("black 3") || guess.equalsIgnoreCase("black 4")||
            guess.equalsIgnoreCase("black 5")){ //checking to see if input is any of the black ones
                break;
            }
            else if(guess.equalsIgnoreCase("red 1") || guess.equalsIgnoreCase("red 2") || 
            guess.equalsIgnoreCase("red 3") || guess.equalsIgnoreCase("red 4")|| 
            guess.equalsIgnoreCase("red 5")){ //checking to see if the input is any of the red ones
                break; 
            }
            else{ // if its neither one the user must try again
                System.out.println("bad try again.");
                
            }
        }
    
        System.out.println("*The wheel is spinning*");
        int ranColor= (int)(Math.random()*2); //generates a random number
        int ranNum=(int)(Math.random()*5); //generates a random number
        switch(ranColor){//picks a color based on the random number
            case 0:
            color="red";
            break;
            case 1:
            color="black";
            break;
        }
        switch(ranNum){ //picks a number based on the random number
            case 0:
            num=1;
            break;
            case 1:
            num=2;
            break;
            case 2:
            num=3;
            break;
            case 3:
            num=4;
            break;
            case 4:
            num=5;
            break;
            
        }
        String wheel=color+" "+num; //adds color and num together as one string
        System.out.println("The wheel has landed on "+wheel); //printing out the winning guess
        if(wheel.equalsIgnoreCase(guess)){ //checking to see if the user guessed correctly
            System.out.println("Congrats bro."); //if they did they win
        }
        else{// if they didnt guess correctly they lost
            System.out.println("Nope bad guess bro.");
        }
    }//end of spinTheWheel method
    
        /*The third game is scrambler. This game takes a string from the user and 
        gives them back the scrambled version of the word.*/
    public static void scrambler(){
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter a word to scramble: "); //asking the user for input
        String word=myScanner.nextLine(); //saving user input
        int l=word.length(); //checking the length of the word
        String scram=word; //making scram equal to user input
        int a=0; //initializing a
        for(;a<2; a++){ //scrambles the word twice 
          int num= (int) (Math.random()*(l)); //generates a random number up to length
            char b=scram.charAt(num); //saves the character thats at the random number spot
            String c=scram.substring(1,num); //saves the letters up to the random number spot but not including the first
            char d=scram.charAt(0); //saves the first letter
            String e=scram.substring(num+1,l); //saves the letters from 1+the random number up to the end of the word
            scram=b+c+d+e; //adds the newly scrambled parts of the word 
        }
            System.out.println(scram);//prints out the newly scrambled word
    }//end of scrambler method
}//end of class

    