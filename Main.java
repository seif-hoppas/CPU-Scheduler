import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int choice;
        Scanner scan = new Scanner(System.in);
        choice = scan.nextInt();

        // default
        CPUScheduler strategy;
        switch (choice) {
            case 1:
                strategy = new ShortestJobFirst();
                break;
            case 2:
                strategy = new ShortestRemainingTimeFirst();
                break;
            case 3:
                strategy = new ShortestJobFirst();
                break;
            case 4:
                strategy = new ShortestJobFirst();
                break;
            default:
                strategy = new ShortestJobFirst();
                break;
        }
        strategy.process();

        scan.close();


    }
}
