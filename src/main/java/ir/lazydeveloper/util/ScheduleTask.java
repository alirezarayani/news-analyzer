package ir.lazydeveloper.util;

import java.io.IOException;
import java.io.Serializable;
import java.util.TimerTask;

/**
 * Created by a_rayani on 11/18/2023
 */
public class ScheduleTask extends TimerTask {
    @Override
    public void run() {
        try {
            System.out.println("run schedule task");
            completeTask();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    private void completeTask() throws IOException, ClassNotFoundException {
        ServerSocketConnection serverSocketConnection = ServerSocketConnection.getInstance();
        System.out.println(serverSocketConnection.getNewsList());
    }
}
