package NIO1;

import java.io.*;
import java.nio.channels.FileChannel;

class CopingProcess extends Thread {
    public CopingProcess(String name) {
            super(name);
    }
    @Override
    public void run() {
        Thread.currentThread().getName();
        File file_1 = new File("D:\\нио\\file1.txt");
        File file_2 = new File("D:\\нио\\file2.txt");
        File file_3 = new File("D:\\нио\\file3.txt");
        File file_4 = new File("D:\\нио\\file4.txt");


//копирование из 1 файла во 2 файл
        FileChannel file1Channel = null;
        FileChannel file2Channel = null;
        FileChannel file3Channel = null;
        FileChannel file4Channel = null;
        try {
            file1Channel = new FileInputStream(file_1).getChannel();
            file2Channel = new FileOutputStream(file_2).getChannel();
            file2Channel.transferFrom(file1Channel, 0, file1Channel.size());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally{
            try {
                file1Channel.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                file2Channel.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        //копирование из 3 файла в 4 файл
        try {
            file3Channel = new FileInputStream(file_3).getChannel();
            file4Channel = new FileOutputStream(file_4).getChannel();
            file4Channel.transferFrom(file3Channel, 0, file3Channel.size());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally{
            try {
                file3Channel.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                file4Channel.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
