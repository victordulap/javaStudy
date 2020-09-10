import java.util.Scanner;

public class ex2_2 {
    public static void main(String[] args) {
        Scanner write = new Scanner(System.in);
        
        int n = 0, sum = 0;

        System.out.print("Enter n: ");
        n = write.nextInt();

        int i = 0;
        do {
            System.out.print("Enter nr (" + (i + 1) + "/" + n + "): ");
            sum += write.nextInt();
            
            i++;
        } while (i < n);

        System.out.println("sum = " + sum);
    }
}