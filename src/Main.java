import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int number1 = sc.nextInt();
        System.out.println("Maximum number: " + Math.max(number,number1));
    }
}