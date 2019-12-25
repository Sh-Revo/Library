import java.util.Scanner;
import java.util.concurrent.Semaphore;

public class Main {
    public static void main(String[] args) {
        InputData();
    }


    static void InputData(){
        int pepleCount;
        int maxPeople;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите кол-во людей ");
        pepleCount = scanner.nextInt();
        System.out.println("Введите макс кол-во в библиотеке ");
        maxPeople = scanner.nextInt();
        Semaphore sem = new Semaphore(maxPeople);
        for (int i=1; i<=pepleCount; i++) {
            new Library(sem,i).start();
        }
    }
}
