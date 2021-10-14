package gonki;

public class RabbitAndTurtle {

    public static void main(String[] args) {
        // Создание ниток кролика и черепахи
        Rabbit rabbit = new Rabbit("Кролик");
        Tur tur = new Tur("Черепашка");
        // Запускаем гонку

        rabbit.start();
        tur.start();
    }
}