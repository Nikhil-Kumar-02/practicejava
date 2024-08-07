public class DebugLogger extends ChainAbstract{

    DebugLogger(ChainAbstract nextLogger) {
        super(nextLogger);
    }

    @Override
    public void log(int level) {
        if(level == DEBUG){
            System.out.println("Inside the debug Controls");
        }
        else{
            super.log(level);
        }
    }
    
}
