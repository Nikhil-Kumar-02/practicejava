public interface OberverableProduct {
    public void add(ObserverUser obj);
    public void remove(ObserverUser obj);
    public void notification();
    public void setItemLeftCount(int items);
    public int getItemLeftCount();
    public void PrintMessage();
}
