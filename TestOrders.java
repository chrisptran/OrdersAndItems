public class TestOrders {
    public static void main(String[] args) {
        
        //menu items
        Item item1 = new Item();
        item1.name = "hot coffee";
        item1.price = 2.0;

        Item item2 = new Item();
        item2.name = "cold brew";
        item2.price = 3.5;

        Item item3 = new Item();
        item3.name = "vanilla latte";
        item3.price = 4.5;

        Item item4 = new Item();
        item4.name = "nitro cold brew";
        item4.price = 5.0;

        // order variables -- order1, order2 etc

        Order order1 = new Order();
        order1.name = "Chris";

        Order order2 = new Order();
        order2.name = "Barbs";

        Order order3 = new Order();
        order3.name = "Tina";

        Order order4 = new Order();
        order4.name = "Joe";

        // applicable simulations

        order1.items.add(item1);
        order1.total += item1.price;
        order1.ready = true;

        order2.items.add(item2);
        order2.items.add(item2);
        order2.total += item2.price * 2;
        order2.ready = false;

        order3.items.add(item3);
        order3.total += item3.price;
        order3.ready = true;

        order4.items.add(item4);
        order4.total += item4.price * 2;
        order4.ready = false;

        //use this example code to test various order updates
        System.out.printf("Name: %s \n", order1.name);
        System.out.printf("Total: %s \n", order1.total);
        System.out.printf("Your order is ready: %s \n", order1.ready);

        System.out.printf("Name: %s \n", order2.name);
        System.out.printf("Total: %s \n", order2.total);
        System.out.printf("Your order is ready: %s \n", order2.ready);

        System.out.printf("Name: %s \n", order3.name);
        System.out.printf("Total: %s \n", order3.total);
        System.out.printf("Your order is ready: %s \n", order3.ready);

        System.out.printf("Name: %s \n", order4.name);
        System.out.printf("Total: %s \n", order4.total);
        System.out.printf("Your order is ready: %s \n", order4.ready);
    }
}
