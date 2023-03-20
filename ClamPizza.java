public class ClamPizza extends Pizza {
    // To make a pizza now, we need a factory to provide the ingredients.
    PizzaIngredientFactory ingredientFactory;
    // class gets a factory
    public ClamPizza(PizzaIngredientFactory ingredientFactory) {
    this.ingredientFactory = ingredientFactory;
    }
    void prepare() {
    System.out.println("Preparing " + name);
    dough = ingredientFactory.createDough();
    sauce = ingredientFactory.createSauce();
    cheese = ingredientFactory.createCheese();
    clam = ingredientFactory.createClam();
    }

    @Override
     public String toString(){
        return super.toString() + clam.toString();
     }
}    