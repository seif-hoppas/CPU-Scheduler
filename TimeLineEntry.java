public class TimeLineEntry {
    private String ProcessName;
    private int StartTime;
    private int  FinishTime;


    public String getProcessName() {
        return this.ProcessName;
    }

    public int getStartTime() {
        return this.StartTime;
    }

    public int getFinishTime() {
        return this.FinishTime;
    }

    public void setFinishTime(int finish) {
        this.FinishTime = finish;
    }
}

