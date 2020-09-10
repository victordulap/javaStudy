import java.util.Scanner;

public class ex1_1 {
    public static void main(String[] args) {
        //ex1 if-else
        
        Scanner sc = new Scanner(System.in);

        char randChar; // = 'X';
        
        do {
            System.out.print("\nEnter char:");
            randChar = sc.next().charAt(0);

            char toLowerRandChar = Character.toLowerCase(randChar);
            if (toLowerRandChar == 'a' || toLowerRandChar == 'e' || toLowerRandChar == 'i' ||
            toLowerRandChar == 'o' || toLowerRandChar == 'u') {
                System.out.println("" + randChar + " este o vocala");
            }
            else if (toLowerRandChar == 'b' || toLowerRandChar == 'c' || toLowerRandChar == 'd' ||
            toLowerRandChar == 'f' || toLowerRandChar == 'h' || toLowerRandChar == 'j'
            || toLowerRandChar == 'k' || toLowerRandChar == 'l' || toLowerRandChar == 'm'
            || toLowerRandChar == 'n' || toLowerRandChar == 'p' || toLowerRandChar == 'q'
            || toLowerRandChar == 'r' || toLowerRandChar == 's' || toLowerRandChar == 't'
            || toLowerRandChar == 'v' || toLowerRandChar == 'w' || toLowerRandChar == 'x'
            || toLowerRandChar == 'y' || toLowerRandChar == 'z') {
                System.out.println("" + randChar + " este o consoana");
            }
            else {
                System.out.println(randChar + " nu este nici o vocala nici o consoana");
            }
            System.out.println("\tEnter ! to exit");
        } while (randChar != '!');
    }
}