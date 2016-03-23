import java.util.Scanner;
public class Triangles {
    // main method required for every Java program
    public static void main(String[] args) {
        //declaring an instance of the scanner object
        Scanner myScanner = new Scanner(System.in);

        int triangleNum = 0;
        int a = 1;


        while (true) { //checking to see if the input is in the correct form
            System.out.print("Input an integer between 5 and 30: ");
            if (myScanner.hasNextInt()) { // checking if input is an int
                triangleNum = myScanner.nextInt();
                if (triangleNum >= 5 && triangleNum <= 30) { //checking to see if length is less than 80
                    break;
                }
                else { //if the length is bigger than 80 this runs
                    System.out.println("Sorry the input must be between 5 and 30.");
                    myScanner.nextLine();
                }
            }
            else { //if the input is not an integer this runs
                System.out.println("Sorry the input must be an integer.");
                myScanner.nextLine();
            }
        }

        for (int c = 0; c < triangleNum; c++) {
            for (int b = 0; b < a; b++) {
                System.out.print(a);
            }
            System.out.println();
            a++;
        }

        int s = (triangleNum - 1);
        for (int d = 1; d < triangleNum; d++) {
            for (int e = 0; e < s; e++) {
                System.out.print(s);
            }
            System.out.println();
            s--;
        }

        System.out.println();

        int f = 0;
        int g;
        int h = 1;
        int i;
        int x = 1;


        while (f < triangleNum) {
            g = 0;
            while (g < x) {
                g++;
                System.out.print(x);
            }
            System.out.println();
            x++;
            f++;
        }

        int t = (triangleNum - 1);
        while (h < triangleNum) {
            i = 0;
            while (i < t) {
                i++;
                System.out.print(t);
            }
            System.out.println();
            t--;
            h++;
        }
        
        System.out.println();
        
        int j=0;
        int l;
        int m=1;
        int n;
        int y=1;
        
        if (j < triangleNum) {
            do {
                l = 0;
                if(l < y) {
                    do{
                    System.out.print(y);
                    l++;
                }while(l<y);
            }
                System.out.println();
                y++;
                j++;
            }while (j < triangleNum);
        }
        
    int w=(triangleNum-1);
        if (m < triangleNum) {
            do {
                n = 0;
                if(n < w) {
                    do{
                    System.out.print(w);
                    n++;
                }while(n<w);
            }
                System.out.println();
                w--;
                m++;
            }while (m < triangleNum);
        }


    }
}