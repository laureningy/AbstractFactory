public class MyPizzaApp<franchise extends PizzaStore, pizzaKind extends PizzaIngredientFactory>{
    franchise store;
    pizzaKind pizza;

    MyPizzaApp(){
        
    }

    public static void main(String args[]){
        PizzaStore nyPizzaStore = new NYPizzaStore();
        System.out.println(nyPizzaStore.orderPizza("cheese"));
    }
}