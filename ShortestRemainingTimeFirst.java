import java.util.PriorityQueue;

public class ShortestRemainingTimeFirst extends CPUScheduler {

    PriorityQueue<ProcessControlBlock> ReadyQueue;
    ProcessControlBlock CurrentProcessControlBlock;

    public ShortestRemainingTimeFirst() {
        CurrentProcessControlBlock = null;
        ReadyQueue = new PriorityQueue<>(new ProcessControlBlockComparator());
    }

    @Override
    public void process() {
        while (!ReadyQueue.isEmpty() || !ProcessControlBlockList.isEmpty() || CurrentProcessControlBlock != null) {

            // Check for new ProcessControlBlock to add in the ReadyQueue
            while (!ProcessControlBlockList.isEmpty() && ProcessControlBlockList.get(0).getBurstTime() <= CurrentProcessControlBlock.getBurstTime() ) {
                readyQueue.add(processes.remove(0));
            }
            if (CurrentProcessControlBlock == null) {
                CurrentProcessControlBlock = ReadyQueue.poll();
            }

        }
    }

}
