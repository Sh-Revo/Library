
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public class Library extends Thread{
    Semaphore sem;
    int id;
    int time = (int) Math.random()*4 + 1;
    public Library( Semaphore sem, int id) {
        this.sem = sem;
        this.id = id;

    }
    Door door = new Door();


    public void run(){
        try {


            System.out.println("Человек " + id + " пришел в библиотеку");
            if (sem.availablePermits()==0){
                System.out.println("Человек " + id + " ждет у входа");
            }
            sem.acquire();
            door.enterDoor(1, id);
            System.out.println("Человек " + id + " зашел в библиотеку");
            System.out.println("Человек "+ id + " начал читать");
            TimeUnit.SECONDS.sleep(time);
            System.out.println("Человек " + id +" закончил читать");
            TimeUnit.SECONDS.sleep(2);
            door.goOutDoor(1,id);
            sem.release();
            System.out.println("\nЧеловек " + id + " покинул библиотеку");

        } catch (InterruptedException e) {
            System.out.println("Проблема с человеком");
            e.printStackTrace();
        }
    }
}
