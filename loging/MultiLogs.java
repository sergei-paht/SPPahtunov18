package loging;

import java.io.*;
import java.util.logging.Logger;

public class MultiLogs {
    // Создание логера
    private static final Logger logger = Logger.getLogger(String.valueOf(MultiLogs.class));
    public static void main(String[] args) {
        // Отображение о начале работ программы в логах
        logger.info("Запуск программы");
        try (BufferedReader br = new BufferedReader(new FileReader("D:\\multip.txt"))) {
            logger.info("Считывание с файла"); // Отображение о считывание из файла в логах
            String line =  br.readLine();
            System.out.println(line);
            String[] values = line.split("\\*");
            int x1 = Integer.parseInt(values[0]);
            int x2 = Integer.parseInt(values[1]);
            logger.info("Начало выполнения умножения");// Отображение начала умножения в логах
            System.out.println("\n" + multiply(x1, x2));
            logger.info("Конец");// Отображение о завершении работы в логах
        }
        catch (IOException e) {
            //Отображение о возникновении ошибки в логах
            logger.info("Ошибка");
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