import java.util.Scanner;

public class ex2_1 {
    public static void main(String[] args) {
        Scanner write = new Scanner(System.in);
        
        int n = 0, sum = 0;

        System.out.print("Enter n: ");
        n = write.nextInt();

        int i = 0;
        while (i < n) {
            System.out.print("Enter nr (" + (i + 1) + "/" + n + "): ");
            sum += write.nextInt();
            
            i++;
        }

        System.out.println("sum = " + sum);
    }
}