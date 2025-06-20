package SingletonPatternExample;

public class Logger {

    public static Logger instance;
    public static int logno=1;
    private Logger(){
        System.out.println("Logger Initialized");
    }
    
    public static Logger getInstance()  {
        return instance = (instance==null ? new Logger() : instance);
    }

    public void log(String msg){
        System.out.printf("[%d:%s] => %s\n",logno,instance,msg);
        logno++;
    }

    
}