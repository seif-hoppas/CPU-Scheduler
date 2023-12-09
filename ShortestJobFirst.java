import java.util.ArrayList;
import java.util.PriorityQueue;

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
        int start_time = 0;
        int finish_time = 0;
        for (ProcessControlBlock processControlBlock : ReadyQueue) {
            start_time = finish_time;
            finish_time += processControlBlock.getBurstTime();
            Timeline.add(new TimeLineEntry(processControlBlock.getName(), start_time, finish_time));
        }
        for(TimeLineEntry time : Timeline){
            time.print();
        }
    }
}
