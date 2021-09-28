//Умножения без операции умножения считывание с документа
import java.io.*;
public class zadanie3 {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("Умножение.txt"))) {
            String line =  br.readLine();
            System.out.println(line);
            String[] values = line.split("\\*");
            int x1 = Integer.parseInt(values[0]);
            int x2 = Integer.parseInt(values[1]);
            System.out.println("\n" + multiply(x1, x2));
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    public static int multiply(int x, int y) {
        if (y == 0)
            return 0;

        //Добавить х по одному

        if (y > 0)
            return (x + multiply(x, y - 1));

        // случай, когда у отрицателен
        if (y < 0)

            return -multiply(x, -y);

        return -1;
    }
}
