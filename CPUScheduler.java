import java.util.ArrayList;
import java.util.List;

public abstract class CPUScheduler {

    // Represent the Gantt Chart of the scheduling process
    ArrayList<TimeLineEntry> Timeline;

    
    List<ProcessControlBlock> ProcessControlBlockList;

    // Represent the main logic of the algorithm
    public abstract void process();

    public void AddProcess(ProcessControlBlock PCB){
        ProcessControlBlockList.add(PCB);
    
    }
}
