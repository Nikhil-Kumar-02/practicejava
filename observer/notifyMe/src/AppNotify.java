public class AppNotify {
    public static void main(String[] args) throws Exception {
        //we are implementing that there are multiple products which can went out of stock and on
        //each product multiple user can enable notify me when product comes in stock functionality
        OberverableProduct item1 = new Product1();
        OberverableProduct item2 = new Product2();
        OberverableProduct item3 = new Product3();

        item1.add(new UserConcrete(item1));
        item1.add(new UserConcrete(item1));

        item2.add(new UserConcrete(item2));

        item3.add(new UserConcrete(item3));
        item3.add(new UserConcrete(item3));

        item1.setItemLeftCount(10);
        item2.setItemLeftCount(2);
        item3.setItemLeftCount(0);
        item3.setItemLeftCount(2);
        item1.setItemLeftCount(5);
    }
}


