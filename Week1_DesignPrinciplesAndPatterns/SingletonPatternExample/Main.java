package SingletonPatternExample;

public class Main {
    public static void main(String[] args) {
        for(int i=0;i<100;i++){
            Logger.getInstance().log("Hello : "+i);
        }
    }
}
