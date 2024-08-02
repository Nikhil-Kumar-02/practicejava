import java.util.ArrayList;
import java.util.List;

public class ObserverableImpl implements OberverableProduct{

    List<ObserverUser> AllUsersList = new ArrayList<>();
    int ItemsCount = 0;
    @Override
    public void add(ObserverUser obj) {
        AllUsersList.add(obj);
    }

    @Override
    public void remove(ObserverUser obj) {
        AllUsersList.remove(obj);
    }

    @Override
    public void notification(){
        for(ObserverUser user : AllUsersList){
            user.update();
        }
    }

    @Override
    public void setItemLeftCount(int items) {
        this.ItemsCount = items;
        if(ItemsCount > 0){
            notification();
        }
    }

    @Override
    public int getItemLeftCount() {
        return this.ItemsCount;
    }

    public void PrintMessage(){
        
    }
    
}
