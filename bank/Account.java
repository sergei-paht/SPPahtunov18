package bank;
import java.util.Scanner;
import java.util.Random;

public class Account extends Thread {
    int balance;

    public Account(int balance) {

        this.balance = balance;
    }
    public void run() {// Начальное пополнение баланса случайным способом
        Thread.currentThread().getName();
        int addBalance = 0;
        Random r = new Random();
        addBalance = r.nextInt(100000) ;
        balance += addBalance;
        System.out.println("Ваш баланс " + balance + " рублей");
        Scanner in = new Scanner(System.in);
        System.out.println("Укажите сколько вы хотите снять денег:");
        int withdrawal = in.nextInt();
        if (withdrawal <= balance){ //
            withdrawMoney(withdrawal);
        }
        else{
            System.out.println("У вас не достаточно средств на счету");
            System.out.println("Вы хотите пополнить баланс?");
            System.out.println("Если да то введите 1, иначе - 2");
            int question  = in.nextInt();
            if(question == 1){
                System.out.println("Укажите сколько хотите положить:");
                int deposit  = in.nextInt();
                depositMoney(deposit);
            }
            else {
                System.out.println("Спасио за пользование нашим банком! Ждем вас еще!");
            }

        }
    }

    public void withdrawMoney(int withdrawal){ //Метод снятия денег с баланса
        balance -= withdrawal;
        System.out.println("Вы сняли - " + withdrawal+ " рублей" + " -- Ваш оставшиеся баланс - " + balance + " рублей");
    }
    public void depositMoney(int deposit){ // Метод пополнения баланса
        balance += deposit;
        System.out.println("Вы пополнили на - " + deposit+ " рублей" + " -- Ваш баланс - " + balance + " рублей");
    }
}
