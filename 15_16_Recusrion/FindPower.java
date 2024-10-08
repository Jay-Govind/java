import java.util.*;

public class FindPower {

    // public static int calculatePow(int num, int pow) {
    // if (pow == 0) {
    // return 1;
    // }
    // return num * calculatePow(num, pow - 1);
    // }

    // optimized code
    public static int calculatePow(int num, int pow) {
        if (pow == 0) {
            return 1;
        }

        int halfPower = calculatePow(num, (pow / 2));
        int finalPower = halfPower * halfPower;

        if (pow % 2 != 0) {
            halfPower = num * halfPower;
        }

        return finalPower;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int num = sc.nextInt();

        System.out.print("Enter the power : ");
        int pow = sc.nextInt();

        int result = calculatePow(num, pow);
        System.out.print(num + " to the power " + pow + " is " + result);

        sc.close();
    }
}
