import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        System.out.println("Nhập số nguyên để kiểm tra");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        boolean isPrime = true;
        if (number < 2) {
            isPrime = false;
        } else {
            int i = 2;
            while (i <= Math.sqrt(number)) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
                i++;
            }
        }
        if (isPrime) {
            System.out.println("Đây là số nguyên tố");
        } else {
            System.out.println("Đây không là số nguyên tố");
        }

    }
}
