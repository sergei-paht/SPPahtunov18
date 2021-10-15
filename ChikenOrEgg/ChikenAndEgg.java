package ChikenOrEgg;

public class ChikenAndEgg{
    public static void main(String[] args) throws InterruptedException {
        String winner;
        // Создание потоков курица и яйцо
        Dispute chiken = new Dispute("Курица");
        Dispute egg = new Dispute("Яйцо");
        // Запускаем спор

        chiken.start();
        egg.start();
        while (true){
            if (egg.isAlive() && !chiken.isAlive()){
                winner = "Яйцо победило";
                break;
            }
            else{
                winner = "Курица победила";
                break;
            }
        }

        chiken.join();
        egg.join();
        System.out.println(winner);
    }
}

