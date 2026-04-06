import java.util.Scanner;
public class lvl2-NaturalNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, i;
        System.out.print("Enter a number: ");
        n = sc.nextInt();
        for (i=1; i<=n; i++) {
            System.out.print(i + "\t");
        }
        sc.close();
    }
}