import java.util.Scanner;

public class Task05 {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.println("Введите длину линии");
            int num = in.nextInt();
            for (int i = 1; i <= num; i++) {
                System.out.print("*");
            }
       }
}