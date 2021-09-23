//Умножения без операции умножения с использованием класса
import java.io.*;
public class multiplication {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("Умножение.txt"))) {
            String line =  br.readLine();
            System.out.println(line);
            String[] values = line.split("\\*");
            Variables array = new Variables(Integer.parseInt(values[0]), Integer.parseInt(values[1]));
            System.out.println(array.multiply(Integer.parseInt(values[0]), Integer.parseInt(values[1])));
            }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    public static class Variables {
        int x1;
        int x2;

        Variables(int x1, int x2) {
            this.x1 = x1;
            this.x2 = x2;
        }
        public int multiply(int x, int y) {
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
}
