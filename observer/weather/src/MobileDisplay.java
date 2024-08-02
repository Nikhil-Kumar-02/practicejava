public class MobileDisplay extends OberverConcreteDisplay{

    MobileDisplay(Observerble obj) {
        super(obj);
    }

    @Override
    public void update(){
        System.out.print("Mobile Screen : ");
        keepingEyeOnObject.displayMessage();
    }
}
