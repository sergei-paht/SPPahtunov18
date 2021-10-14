package gonki;


/**
 * Класс наследник Thread , для работы с потоками
 */

//кролик
class Rabbit extends Thread{
    public Rabbit(String name) {

        super(name);// Метод построения родительского класса, задаем имя
    }
    @Override
    public void run() {
        int distance = 100;
        for(int i = 1;i <= distance; i ++){ // i обозначает метры
            try {
                Thread.sleep(100);// Отдых 0,1 с
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if(i == distance / 2){
                System.out.println(":::::::::::::::::::::::::");
                System.out.println("Кролик спотыкается и падает");
                System.out.println(":::::::::::::::::::::::::");
                try {
                    Thread.sleep(300);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            // Печатает каждый раз, когда кролик пробегаете 1 метр
            System.out.println(Thread.currentThread().getName()+" пробегает "+i+" Метр ");
            if(i == 100){
                System.out.println(":::::::::::::::::::::::::");
                System.out.println("Кролик прибегает последним");
                System.out.println(":::::::::::::::::::::::::");
            }

        }
    }
}
//черепаха
class Tur extends Thread{
    public Tur(String name) {
        super(name);// Метод построения родительского класса, задаем имя
    }
    @Override
    public void run() {
        int distance = 100;
        for(int i = 1;i <= distance; i ++){ // i обозначает метры
            try {
                Thread.sleep(100);// Отдых на 0,1 с
            } catch (InterruptedException e) {
                System.out.println("Черепаха упала");
            }
            // Печатает каждый раз, когда черепаха пробегаете 1 метр
            System.out.println(Thread.currentThread().getName()+" прогбегает "+i+" Метр ");
            if(i == 100){
                System.out.println(":::::::::::::::::::::::::");
                System.out.println("Черепаха прибегает первой");
                System.out.println(":::::::::::::::::::::::::");
                System.out.println("Кролик еще бежит");
                System.out.println(":::::::::::::::::::::::::");
            }

        }
    }
}