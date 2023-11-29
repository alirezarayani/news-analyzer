package ir.lazydeveloper;

import ir.lazydeveloper.model.News;
import ir.lazydeveloper.util.ScheduleTask;
import ir.lazydeveloper.util.ServerSocketConnection;

import java.io.IOException;
import java.io.Serializable;
import java.util.List;
import java.util.Timer;

/**
 * Created by a_rayani on 11/18/2023
 */
public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ScheduleTask scheduleTask = new ScheduleTask();
        Timer timer = new Timer(false);
        timer.scheduleAtFixedRate(scheduleTask, 0, 10*1000);
    }
}
