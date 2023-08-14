package ss4_ClassAndOop.BaiTap;

import java.util.Date;
import java.util.Scanner;

public class StopWatch {
    private long startTime;
    private long endTime;

    public StopWatch() {
        this.startTime = System.currentTimeMillis();
    }

    public long getStartTime() {
        return startTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }

    public void start(){
        this.startTime = System.currentTimeMillis();
    }

    public void stop(){
        this.endTime = System.currentTimeMillis();
    }

    public long getElapsedTime(){
        return this.endTime-this.startTime;
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        StopWatch watch = new StopWatch();
        do {
            System.out.print("1 to stop: ");
            int temp = sc.nextInt();
            if (temp == 1){
                watch.stop();
                System.out.println(watch.getElapsedTime());
                break;
            }
        }while (true);
    }
}
