import java.util.Scanner;

public class Task07 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое число");
        int num1 = in.nextInt();
        System.out.println("Введите второе число");
        int num2 = in.nextInt();
        if (num1>num2) {int temp = num2;num2=num1;num1=temp;}
        for (int i=num1;i<=num2;i++){
            if(i%3==0&&i%5==0) System.out.println("Fizz Buzz");
            else if (i%3==0) System.out.println("Fizz");
            else if (i%5==0) System.out.println("Buzz");
            else System.out.println(i);
        }
    }

}
