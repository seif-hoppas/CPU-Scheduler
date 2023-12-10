import java.util.List;

public abstract class CPUScheduler {
    List<ProcessControlBlock> ProcessControlBlockList;
    public abstract void process();
    public abstract void AddProcess(ProcessControlBlock process);
}
