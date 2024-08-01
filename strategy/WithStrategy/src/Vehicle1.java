import Strategy.DriveStrategy;

public class Vehicle1 {
    DriveStrategy objDriveStrategy;

    Vehicle1(){

    }
    
    //constructor injection
    Vehicle1(DriveStrategy obj){
        this.objDriveStrategy = obj;
    }

    public void calldrive(){
        objDriveStrategy.drive();
    }

    //if i have not made this middle interface then i have to write this in all possible vehicle like
    //passanger random offroad , etc but we have written it here and unherited it everywhere to reuse it
}
