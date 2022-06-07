import java.text.SimpleDateFormat;
import java.util.Date;

public class Logger {

    private static Logger instance = null;
    protected int num = 1;

    public void log(String msg) {
        Date dateNow = new Date();
        SimpleDateFormat formatForDateNow = new SimpleDateFormat("yyyy.MM.dd hh:mm:ss ");
        System.out.println("[" + formatForDateNow.format(dateNow) + num++ + "]" + msg);
    }

    private static Logger logger;

    private Logger() {
    }

    public static Logger getInstance() {
        if (instance == null) instance = new Logger();
        return instance;
    }
}
