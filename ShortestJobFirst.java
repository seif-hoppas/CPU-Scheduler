import java.awt.List;
import java.util.*;

public class ShortestJobFirst extends CPUScheduler {

    PriorityQueue<ProcessControlBlock> ReadyQueue;

    // Represent the Gantt Chart of the scheduling process
    ArrayList<TimeLineEntry> Timeline;

    public ShortestJobFirst() {
        ReadyQueue = new PriorityQueue<>(new ProcessControlBlockComparator());
        Timeline = new ArrayList<>();
    }

    public void AddProcess(ProcessControlBlock process) {
        this.ReadyQueue.add(process);
    }

    public void process() {
        for (ProcessControlBlock processControlBlock : ReadyQueue) {
        }
    }
}
