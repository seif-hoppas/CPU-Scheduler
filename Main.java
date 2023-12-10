import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int choice;
        Scanner scan = new Scanner(System.in);
        choice = scan.nextInt();

        // default
        CPUScheduler scheduler;
        // ArrayList<ProcessControlBlock> PCB = new ArrayList<>();

        /*
         * ProcessControlBlock p1 = new ProcessControlBlock("p1", 0, 2, 4);
         * ProcessControlBlock p2 = new ProcessControlBlock("p2", 0, 4, 1);
         * ProcessControlBlock p3 = new ProcessControlBlock("p3", 0, 4, 2);
         * ProcessControlBlock p4 = new ProcessControlBlock("p4", 0, 7, 6);
         */

        /*
         * 0 1 2 3 4 5 6 7 8 9 --->
         * - - - - - 1 1 1 1 1 1
         * 2 2
         * 3 3 3 3
         */

        switch (choice) {
            case 1:
                scheduler = new ShortestJobFirst();
                break;
            case 2:
                scheduler = new ShortestRemainingTimeFirst();
                break;
            case 3:
                scheduler = new ShortestJobFirst();
                break;
            case 4:
                scheduler = new ShortestJobFirst();
                break;
            default:
                scheduler = new ShortestJobFirst();
                break;
        }
        scheduler.AddProcess(new ProcessControlBlock("p0", 0, 25, 4));// p0 * 7
        scheduler.AddProcess(new ProcessControlBlock("p1", 5, 4, 4));
        // scheduler.AddProcess(new ProcessControlBlock("p2", 6, 2, 4));// p1
        // scheduler.AddProcess(new ProcessControlBlock("p3", 9, 11, 4));

        scheduler.process();
        

        scan.close();

    }
}
