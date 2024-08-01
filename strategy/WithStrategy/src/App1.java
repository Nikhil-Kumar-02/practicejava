public class App1 {
    public static void main(String[] args) throws Exception {
        Vehicle1 normalDrive = new Passanger1();
        normalDrive.calldrive();

        Vehicle1 randoVehicle = new RandomXyz();
        randoVehicle.calldrive();

        Vehicle1 offroad = new OffRoad2();
        offroad.calldrive();

        //now we have decoupelled the solution and removed code duplicacy
        //also now in run time we can decide which object to call according to our need
        //this also follows open close principle
        //in run time we can decide which object to form by taking input from user
    }   
}
