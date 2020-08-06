import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = scan.nextInt();

        System.out.println("Enter a number: ");
        int b = scan.nextInt();

        System.out.println(a + b);
    }
}
