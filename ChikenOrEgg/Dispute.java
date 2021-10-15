package ChikenOrEgg;


public class Dispute extends Thread{
    public Dispute(String name){
        super(name);
    }

    @Override
    public void run()     {
        int distance = 5;
        for(int i = 1;i <= distance; i ++){
            try {
                Thread.sleep(1000);// 0,1 с
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            // Печатает каждый раз название потока
            System.out.println(Thread.currentThread().getName());
        }
    }
}