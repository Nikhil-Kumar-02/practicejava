public class TVdisplay extends OberverConcreteDisplay {

    TVdisplay(Observerble obj) {
        super(obj);
    }

    @Override
    public void update() {
        System.out.print("Television Screen : ");
        keepingEyeOnObject.displayMessage();
    }
    
}
