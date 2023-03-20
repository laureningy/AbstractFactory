public class ChicagoPizzaIngredientFactory extends PizzaIngredientFactory{

    @Override
    Dough createDough() {
        return new ThickCrustDough();
    }

    @Override
    Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    @Override
    Cheese createCheese() {
        return new Cheese();
    }

    @Override
    Veggie createVeggies() {
        return new Veggie();
    }

    @Override
    Pepperoni createPepperoni() {
        return new Pepperoni();
    }

    @Override
    Clam createClam() {
        return new Clam();
    }
    

}
