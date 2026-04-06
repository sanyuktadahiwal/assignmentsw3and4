import java.util.Scanner;
class lvl1-Vote {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = input.nextInt();
        if (age>=18) {
            System.out.println("The person's age is " + age + " and they are eligible to vote.");
        } else {
            System.out.println("The person's age is " + age + " and they are not eligible to vote.");
        }
        input.close();
    }
}