import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое число");
        int num1 = in.nextInt();
        System.out.println("Введите второе число");
        int num2 = in.nextInt();
        for (int i=num1;i<=num2;i++){
           if(i%2==0) System.out.println(i);
        }
    }
}
