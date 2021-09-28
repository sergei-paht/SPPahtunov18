import java.util.Scanner;
public class zadanie2 {
    static int multiply(int x, int y) {
        /* 0, умноженное на что-либо, дает 0 */
        if (y == 0)
            return 0;

        /* Добавить х по одному */

        if (y > 0)
            return (x + multiply(x, y - 1));


        /* случай, когда у отрицателен */
        if (y < 0)

            return -multiply(x, -y);

        return -1;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите выражение");
        String[] values = scan.nextLine().split("\\*");
        int x1 = Integer.parseInt(values[0]);
        int x2 = Integer.parseInt(values[1]);

        System.out.print("\n" + multiply(x1, x2));

    }
}