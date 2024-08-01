public class App {
    public static void main(String[] args) throws Exception {
        
        Vehicle obj1Vehicle = new Offroad();
        obj1Vehicle.drive();
        Vehicle obj2Vehicle = new Passanger();
        obj2Vehicle.drive();
        Vehicle obj3Vehicle = new SportyVehicle();
        obj3Vehicle.drive();

        //now the problem here is ki the normal passanger class is ok with the inherited drive method
        //but the other ones want to override the method but still using the same body so the moment more 
        //vehicle come into play where they have same body we are duplicating the code and let say we 
        //have to change something then we have to ammend it at every place challanging the art of oops
        //so we have to make use of strategy in such a case

    }
}
