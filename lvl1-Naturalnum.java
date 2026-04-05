import Java.util.Scanner;
public class lvl1-Naturalnum{
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int n = input.nextInt();
    if(n < 1) {
        System.out.println("The number " + n + " is not a natural number.");
        return;
    } else {
        int sum = n*(n-1)/2;
        System.out.println("The sum of natural numbers up to " + n + " is: " + sum);
        }
    input.close();
    }
}