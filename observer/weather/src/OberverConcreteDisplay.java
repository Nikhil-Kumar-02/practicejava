public class OberverConcreteDisplay implements Observer{
    Observerble keepingEyeOnObject;

    OberverConcreteDisplay(Observerble obj){
        this.keepingEyeOnObject = obj;
    }

    @Override
    public void update() {
        keepingEyeOnObject.displayMessage();
    }
    
}
