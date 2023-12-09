public class ProcessControlBlock {
    private String Name;
    private int ArrivalTime;
    private int BurstTime;
    private int PriorityNumber;
    private int TurnAroundTime;

    public ProcessControlBlock(String name, int arrival, int burst, int prority) {
        this.Name = name;
        this.ArrivalTime = arrival;
        this.BurstTime = burst;
        this.PriorityNumber = prority;
        this.TurnAroundTime = 0;
    }

    // getters
    public String getName() {
        return this.Name;
    }

    public int getArrivalTime() {
        return this.ArrivalTime;
    }

    public int getBurstTime() {
        return this.BurstTime;
    }

    public int getTurnAroundTime() {
        return this.TurnAroundTime;
    }

    public int getPriorityNumber() {
        return this.PriorityNumber;
    }

    // setters 
    public void setPriorityNumber(int priority) {
        this.PriorityNumber = priority;
    }

    public void setBurstTime(int time) {
        this.BurstTime = time;
    }

    public void setTurnAround(int time) {
        this.TurnAroundTime = time;
    }

    public void print(){
        System.out.println( "ProcessControlBlock [Name=" + Name + ", ArrivalTime=" + ArrivalTime + ", BurstTime=" + BurstTime + ", PriorityNumber=" + PriorityNumber + "]");
    }

}
