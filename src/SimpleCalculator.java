import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (true) {
            menuCalculator();
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter first number");
                    int a = scanner.nextInt();
                    System.out.println("Enter second number");
                    int b = scanner.nextInt();
                    System.out.println(a + b);

                case 2:
                    System.out.println("Enter first number");
                    int a1 = scanner.nextInt();
                    System.out.println("Enter second number");
                    int b1 = scanner.nextInt();
                    if (a1 > b1) {
                        System.out.println(a1 - b1);
                    } else if (a1 < b1) {
                        System.out.println(b1 - a1);
                    }
                case 3:
                    System.out.println("Enter first number");
                    int a2 = scanner.nextInt();
                    System.out.println("Enter second number");
                    int b2 = scanner.nextInt();
                    System.out.println(a2 * b2);

                case 4:
                    ;
                    System.out.println("Enter first number");
                    int a3 = scanner.nextInt();
                    System.out.println("Enter second number");
                    int b3 = scanner.nextInt();
                    System.out.println(a3 / b3);
                    if (b3 == 0) {
                        System.out.println("can't devide by zero");
                    } else if (a3 == 0) {
                        System.out.println("can't devide by zero");
                    }
            }
        }

    }

    public static void menuCalculator() {
        System.out.println("Please choose number: ");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");
        System.out.println("5. Exit");
    }
}