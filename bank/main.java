package bank;

public class main {
    public static void main(String[] args){
        Account stremAdding = new Account(0); // Поток для добавления денег (Баланс изначально равен 0)
        stremAdding.start();
    }
}
