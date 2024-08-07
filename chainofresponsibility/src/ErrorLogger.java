public class ErrorLogger extends ChainAbstract{

    ErrorLogger(ChainAbstract nextLogger) {
        super(nextLogger);
    }

    @Override
    public void log(int level) {
        if(level == ERROR){
            System.out.println("Inside the error Controls");
        }
        else{
            super.log(level);
        }
    }
    
}
