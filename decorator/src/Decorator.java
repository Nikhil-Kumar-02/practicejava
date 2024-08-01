public class Decorator {
    public static void main(String[] args) throws Exception {
        PizzaBase pizza1 = new FarmHouse();
        System.out.println("the total cost is " + pizza1.cost());


        PizzaBase pizza2 = new Mushroom(new FarmHouse());
        System.out.println("the total cost is " + pizza2.cost());


        PizzaBase pizza3 = new ExtraCheese( new Mushroom( new VegDelight()));
        System.out.println("the total cost is " + pizza3.cost());


        PizzaBase pizza4 =new Mushroom(new ExtraCheese( new Margherita()));
        System.out.println("the total cost is " + pizza4.cost());

    }
}
