import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое число");
        int num1 = in.nextInt();
        System.out.println("Введите второе число");
        int num2 = in.nextInt();
        int sum = 0;
        if (num1>num2) {int temp = num2;num2=num1;num1=temp;}
        for (int i=num1;i<=num2;i++){
            sum+=i;
        }
        System.out.println(sum+"  "+(float) sum/(1+num2-num1));
    }
}
