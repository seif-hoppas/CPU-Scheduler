import java.util.Comparator;

public class ProcessControlBlockComparator implements Comparator<ProcessControlBlock> {
    public int compare(ProcessControlBlock x, ProcessControlBlock y) {
        return x.getBurstTime() - y.getBurstTime();
    }
}
