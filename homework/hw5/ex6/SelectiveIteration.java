import java.util.Scanner;

public class SelectiveIteration {
    public static void main(String[] args) {
        Scanner write = new Scanner(System.in);
        
        int num = 0;

        do {
            System.out.print("Enter num (1000 < num < 2000): ");
            num = write.nextInt();
        } while (num >= 2000 || num <= 1000);

        int i = -1;
        while (i < num) {
            i++; // am pus i++ la inceput pentru ca sa nu sa se repete el si in body la if-ul de jos (de asta si am setat i = -1 ca sa incepem de la 0)

            if((i % 3 == 0) || ((i + 5) % 7 == 0) || (i % 10 == 0))
                continue;

            System.out.println(i);
        } 
    }
}