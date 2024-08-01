public class App3 {
    public static void main(String[] args) throws Exception {
        Observerble EastWeatherInstance = new EastWeather();
        Observerble WestWeatherInstance = new WestWeather();

        Observer tvSubscription1 = new TVdisplay(EastWeatherInstance);
        Observer tvSubscription2 = new TVdisplay(EastWeatherInstance);
        Observer tvSubscription3 = new TVdisplay(WestWeatherInstance);

        EastWeatherInstance.add(tvSubscription1);
        EastWeatherInstance.add(tvSubscription2);

        WestWeatherInstance.add(tvSubscription3);


        EastWeatherInstance.setTemp(5);
        EastWeatherInstance.setTemp(5);
        EastWeatherInstance.setTemp(15);
        
        WestWeatherInstance.setTemp(25);

    }
}
