package CreationalPatterns.BuilderPattern;

public class main {

    public static void main(String[] args) {
        Waiter waiter = new Waiter();
        PizzaBuilder normal = new NormalPizzaBuilder();

        waiter.setPizzaBuilder(normal);
        waiter.preparePizza();


        Pizza p = waiter.getPizza();

    }

}
