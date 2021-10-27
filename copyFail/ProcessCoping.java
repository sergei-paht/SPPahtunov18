package copyFail;
import java.io.*;

public class ProcessCoping extends Thread {
    public ProcessCoping(String name) {
        super(name);
    }

    @Override
    public void run() {
        Thread.currentThread().getName();
        File file_1 = new File("D:\\1_Fail.txt");
        File file_2 = new File("D:\\2_Fail.txt");
        File file_3 = new File("D:\\3_Fail.txt");
        File file_4 = new File("D:\\4_Fail.txt");
        // Потоки ввода и вывода для 1 и 2 файла
        InputStream is1 = null;
        OutputStream os1 = null;
        // Потоки ввода и вывода для 3 и 4 файла
        InputStream is2 = null;
        OutputStream os2 = null;


//копирование из 1 файла во 2 файл
        try {
            is1 = new FileInputStream(file_1);
            os1 = new FileOutputStream(file_2);
            byte[] buffer = new byte[1024];
            int length;
            while ((length = is1.read(buffer)) > 0) {
                os1.write(buffer, 0, length);

            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        //копирование из 3 файла в 4 файл
        try {
            is2 = new FileInputStream(file_3);
            os2 = new FileOutputStream(file_4);
            byte[] buffer = new byte[1024];
            int length;
            while ((length = is2.read(buffer)) > 0) {
                os2.write(buffer, 0, length);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


    
