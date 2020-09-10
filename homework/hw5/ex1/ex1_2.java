import java.util.Scanner;

public class ex1_2 {
    public static void main(String[] args) {
        //ex1 switch (nu cea mai buna solutie de a folosi switch in acest caz :))
        
        Scanner sc = new Scanner(System.in);

        char randChar; // = 'X';
        
        do {
            System.out.print("\nEnter char:");
            randChar = sc.next().charAt(0);

            char toLowerRandChar = Character.toLowerCase(randChar);

            switch (randChar) {
                //#region vocale
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u': {
                    System.out.println("" + randChar + " este o vocala");
                    break;
                }
                //#endregion
                //#region consoane
                case 'b': 
                case 'c': 
                case 'd': 
                case 'f': 
                case 'h': 
                case 'j': 
                case 'k': 
                case 'l': 
                case 'm': 
                case 'n': 
                case 'p': 
                case 'q': 
                case 'r': 
                case 's': 
                case 't': 
                case 'v': 
                case 'w': 
                case 'x': 
                case 'y': 
                case 'z': {
                    System.out.println("" + randChar + " este o consoana");
                    break;
                }
                //#endregion
                
                //rest
                default: {
                    System.out.println(randChar + " nu este nici o vocala nici o consoana");
                }
            }
            System.out.println("\tEnter ! to exit");
        } while (randChar != '!');
    }
}