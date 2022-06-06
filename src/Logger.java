public class Logger {

    private static Logger instance = null;
    protected  int num = 1;

    public void log(String msg){
        System.out.println("[" + num++ + "]" + msg);
    }

    private static Logger logger;

    private Logger(){};

    public static Logger getInstance(){
        if (instance == null) instance = new Logger();
        return instance;
    }
}
