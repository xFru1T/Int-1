import java.util.Scanner;
class Int {
    public static long getFactorial(int num) {
        if (num == 0 || num == 1) {
            return 1;
        }
        return num * getFactorial(num - 1);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Print number: ");
        int num = scanner.nextInt();
        System.out.println("Factorial is number: " + getFactorial(num));
    }
}
