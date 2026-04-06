import java.util.Scanner;
public class lvl2-Bonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double salary, years;
        System.out.println("Enter your salary: ");
        salary = sc.nextDouble();
        System.out.println("Enter your years of service: ");
        years = sc.nextDouble();
        if (years > 5) {
            double bonus = salary * 0.05;
            System.out.println("Your bonus is: " + bonus);
        }
        sc.close();
    }
}