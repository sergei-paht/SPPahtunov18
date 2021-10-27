package copyFail;

public class CreateStreamCoping {

    public static void main(String[] args){
        ProcessCoping stream1 = new ProcessCoping("Поток 1");
        ProcessCoping stream2 = new ProcessCoping("Поток 2");

        stream1.start();
        stream2.start();
        long start = System.nanoTime();
        // засекаем время до выполнения копирования
        System.out.println("Время копирования файла с помощью потоков = " + (System.nanoTime() - start));
    }
}
