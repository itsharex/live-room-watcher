package cool.scx.live_room_watcher.util;


import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

public class Helper {

    public static final ScheduledExecutorService SCHEDULER = Executors.newScheduledThreadPool(Runtime.getRuntime().availableProcessors() * 2);
    

}
