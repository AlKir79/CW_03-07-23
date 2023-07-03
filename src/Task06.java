import java.util.Scanner;

public class Task06 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите длину линии");
        int num = in.nextInt();
        System.out.println("Введите символ");
        String key = in.next();
        for (int i = 1; i <= num; i++) {
            System.out.println(key);
        }
    }
}
