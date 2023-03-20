public class NYPizzaIngredientFactory extends PizzaIngredientFactory {

    @Override
    Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    Sauce createSauce() {
        return new MarinaraSauce();
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
