public class Main {
    public static void main(String[] args) {
        ProcessControlBlock p1 = new ProcessControlBlock("p1", 0, 2, 4);
        ProcessControlBlock p2 = new ProcessControlBlock("p2", 0, 4, 1);
        ProcessControlBlock p3 = new ProcessControlBlock("p3", 0, 4, 2);
        ProcessControlBlock p4 = new ProcessControlBlock("p4", 0, 7, 6);

        CPUScheduler FCFS = new ShortestJobFirst();
        FCFS.AddProcess(p4);
        FCFS.AddProcess(p1);
        FCFS.AddProcess(p3);
        FCFS.AddProcess(p2);

        FCFS.process();
    }
}

