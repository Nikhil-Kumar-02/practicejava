import java.util.ArrayList;
import java.util.List;

public class ObserverableConcrete implements Observerble {
    @SuppressWarnings({ "unchecked", "rawtypes" })
    List<Observer> list = new ArrayList();
    int currTemp = 0;
    @Override
    public void add(Observer objObserver) {
        list.add(objObserver);
    }

    @Override
    public void remove(Observer objObserver) {
        list.remove(objObserver);
    }

    public void notification(){
        for(Observer obj:list){
            // System.out.println("calling notification " + obj);
            obj.update();
        }
    }


    @Override
    public void setTemp(int t) {
        if(currTemp != t){
            System.out.println("setting temp " + currTemp + "  " + t);
            currTemp = t;
            notification();
        }
    }

    @Override
    public int getTemp() {
        return currTemp;
    }

    @Override
    public void displayMessage() {
        
    }
    
}
