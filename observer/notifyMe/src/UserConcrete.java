public class UserConcrete implements ObserverUser{

    OberverableProduct TrackingProduct;

    UserConcrete(OberverableProduct product){
        this.TrackingProduct = product;
    }

    @Override
    public void update() {
        TrackingProduct.PrintMessage();
    }
    
}
