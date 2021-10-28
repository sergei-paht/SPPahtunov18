package NIO1;

public class CreateSteamCoping {
    public static void main(String[] args){
        CopingProcess stream1 = new CopingProcess("Поток 1");
        CopingProcess stream2 = new CopingProcess("Поток 2");

        stream1.start();
        stream2.start();
        long start = System.nanoTime();
        // засекаем время до выполнения копирования
        System.out.println("Время копирования файла с помощью потоков = " + (System.nanoTime() - start));
    }

}
