import java.util.Scanner;

public class UsingTernaryOperator {
    public static void main(String[] args) {
        Scanner write = new Scanner(System.in);
        
        double num = 0;

        System.out.print("Enter num: ");
        num = write.nextDouble();

        // am folosit nested ternary operator pentru ca n-ati specificat ce va fi cu numerele intre 1...1000000
        String message = (num >= 1000000) ? "Large" : (num <= 0) ? "Small" : "Normal" ;

        System.out.println(num + " is " + message);
    }
}