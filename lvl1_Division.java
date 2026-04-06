import java.util.Scanner;
public class lvl1_Division {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num1 = scanner.nextInt();
        int quotient = num1/5;

        if (quotient != 0) {
            System.out.println("Is the number " + num1 + " divisible by 5? Yes, the quotient is " + quotient);
        } else {
            System.out.println("Is the number " + num1 + " divisible by 5? No.");
        }
        scanner.close();
    }
}