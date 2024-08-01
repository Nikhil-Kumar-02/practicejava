public interface Observerble {
    public void add(Observer objObserver);
    public void remove(Observer objObserver);
    public void notification();
    public void setTemp(int t);
    public int getTemp();
    public void displayMessage();
}
