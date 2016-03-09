//Soniet Berrios CSE2 hw06
//Text Spinner 
//Infinite loop of different characters
//Due 3/8/16
public class TextSpinner{
 // main method required for every Java program
        public static void main(String[] args) {
            while (true){ //keeps running the inside forever 
                System.out.print("/");
                System.out.print("\b"); //eliminates the previous character 
                System.out.print("-");
                System.out.print("\b"); //eliminates the previous character 
                System.out.print("\\");
                System.out.print("\b"); //eliminates the previous character 
                System.out.print("|");
                System.out.print("\b"); //eliminates the previous character 
            }
            
}//end of main method
}//end of class