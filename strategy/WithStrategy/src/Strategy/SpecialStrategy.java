package Strategy;

public class SpecialStrategy implements DriveStrategy {

    @Override
    public void drive() {
        System.out.println("This is a special Strategy");
    }
    
}
