public class TimeLineEntry {
    private String ProcessName;
    private int StartTime;
    private int FinishTime;

    TimeLineEntry(String ProcessName, int StartTime, int FinishTime) {
        this.ProcessName = ProcessName;
        this.StartTime = StartTime;
        this.FinishTime = FinishTime;
    }

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

    @Override
    public String toString() {
        return "TimeLineEntry [ProcessName=" + ProcessName + ", StartTime=" + StartTime + ", FinishTime=" + FinishTime
                + "]";
    }

    public void print() {
        System.out.println(this.toString());
    }
}
