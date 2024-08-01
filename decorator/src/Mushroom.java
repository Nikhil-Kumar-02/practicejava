public class Mushroom extends ToppingDecorator{
    PizzaBase baseobj;

    Mushroom(PizzaBase obj){
        this.baseobj = obj;
    }

    @Override
    public int cost() {
        return baseobj.cost() + 50;
    }
}
