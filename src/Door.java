import java.util.concurrent.TimeUnit;

public class Door {
    public void enterDoor(double timeEnter, int id) throws InterruptedException {
        synchronized (this){
            System.out.println("Человек "+ id + " подошел к двери с улицы");
            System.out.println("Человек "+ id + " проходит через дверь внутрь");
            TimeUnit.MILLISECONDS.sleep((int)(timeEnter*1000));
            System.out.println("Человек "+ id + " прошел через дверь внутрь");
        }
    }


    public void goOutDoor(double timeEnter, int id) throws InterruptedException {
        synchronized (this){
            System.out.println("Человек "+ id + " подошел к двери изнутри");
            System.out.println("Человек "+ id + " проходит через дверь наружу");
            TimeUnit.MILLISECONDS.sleep((int)(timeEnter*1000));
            System.out.println("Человек "+ id + " прошел через дверь наружу");
        }
    }

}
