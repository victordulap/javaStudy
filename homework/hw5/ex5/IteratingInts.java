import java.util.Scanner;

public class IteratingInts {
    public static void main(String[] args) {
        Scanner write = new Scanner(System.in);
        
        int num = 0;

        System.out.print("Enter num: ");
        num = write.nextInt();

        for (int i = 1; i <= num; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(i);
            }

            System.out.println();
        } 
    }
}