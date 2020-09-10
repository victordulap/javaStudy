import java.util.Scanner;

public class MultiplicativeTable {
    public static void main(String[] args) {
        Scanner write = new Scanner(System.in);
        
        int n = 0;

        System.out.print("Enter n: ");
        n = write.nextInt();

        for (int i = 0; i < 11; i++) {
            System.out.println(n + " * " + i + " = " + (n * i));
        }
    }
}