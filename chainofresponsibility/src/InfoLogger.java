public class InfoLogger extends ChainAbstract{

    InfoLogger(ChainAbstract nextLogger) {
        super(nextLogger);
    }

    @Override
    public void log(int level) {
        if(level == INFO){
            System.out.println("Inside the info Controls");
        }
        else{
            super.log(level);
        }
    }
    
}
