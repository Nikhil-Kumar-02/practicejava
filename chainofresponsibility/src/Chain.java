public class Chain {
    public static void main(String[] args) throws Exception {
        
        ChainAbstract obj = new ErrorLogger(new InfoLogger(new DebugLogger(null)));
        obj.log(2);

    }
}
