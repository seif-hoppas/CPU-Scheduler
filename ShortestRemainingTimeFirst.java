import java.util.ArrayList;
import java.util.PriorityQueue;

public class ShortestRemainingTimeFirst extends CPUScheduler {
    // Time Line
    /*
     * p0   p0
     *   p1
     */

    PriorityQueue<ProcessControlBlock> ReadyQueue;
    ProcessControlBlock CurrentProcessControlBlock;

    public ShortestRemainingTimeFirst() {
        CurrentProcessControlBlock = null;
        ReadyQueue = new PriorityQueue<>(new ProcessControlBlockComparator());
        ProcessControlBlockList = new ArrayList<ProcessControlBlock>();
        Timeline = new ArrayList<>();
    }

    // Process
    /*
     * 1 2 3 4 5 6 7 8 9 --->
     * - - - - 1 1 1 1 1 1
     *             2 2
     *                  3 3 3 3
     */

    @Override
    public void process() {
        int currentTime = 0;
        while (!ReadyQueue.isEmpty() || !ProcessControlBlockList.isEmpty()) {

            // submit a new process to the Ready Queue
            while (!ProcessControlBlockList.isEmpty() && ProcessControlBlockList.get(0).getArrivalTime() <= currentTime) {
                // remove from list , add to readyqueue
                ReadyQueue.add(ProcessControlBlockList.remove(0));
            }

            // catch the smallest burst Process , check if i do have a process
            if (!ReadyQueue.isEmpty()) {
                CurrentProcessControlBlock = ReadyQueue.poll();
            }

            if(CurrentProcessControlBlock != null){
                System.out.println("Time " + currentTime + ": Running process " + CurrentProcessControlBlock.getName());

                // Add very process to execute in the time line
                if(Timeline.size() == 0){
                    Timeline.add(new TimeLineEntry(CurrentProcessControlBlock.getName() , currentTime, currentTime + 1));
                }

                // a new process to be added into the Timeline 
                else if(Timeline.size() != 0 && CurrentProcessControlBlock.getName() != Timeline.get(Timeline.size() - 1).getProcessName()){
                    Timeline.add(new TimeLineEntry(CurrentProcessControlBlock.getName() , currentTime, currentTime + 1));
                }
                // the process still executing then update its finish time 
                else{
                    Timeline.get(Timeline.size() - 1).setFinishTime(currentTime);
                }

                CurrentProcessControlBlock.setBurstTime(CurrentProcessControlBlock.getBurstTime() - 1);
                if(CurrentProcessControlBlock.getBurstTime() != 0){
                    ReadyQueue.add(CurrentProcessControlBlock);
                }
            }

            // deattach the process
            CurrentProcessControlBlock = null;

            currentTime++;
        }

        for (TimeLineEntry timeLineEntry : Timeline) {
            timeLineEntry.print();
        }
    }
}
