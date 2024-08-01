public class ExtraCheese extends ToppingDecorator{
    PizzaBase baseobj;

    ExtraCheese(PizzaBase obj){
        this.baseobj = obj;
    }

    @Override
    public int cost() {
        return baseobj.cost() + 25;
    }
    
}
