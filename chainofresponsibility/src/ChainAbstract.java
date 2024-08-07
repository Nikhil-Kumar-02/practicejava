public abstract class ChainAbstract {
    public int DEBUG = 1;
    public int INFO = 2;
    public int ERROR = 3;
    
    ChainAbstract nextLinedLogger;
    ChainAbstract(ChainAbstract nextLogger){
        this.nextLinedLogger = nextLogger;
    }

    public void log(int level){
        if(nextLinedLogger != null){
            nextLinedLogger.log(level);
        }
    };
}
