public abstract class Pizza {
    // each pizza has a name and ingredients
    String name;
    Dough dough;
    Sauce sauce;
    Cheese cheese;
    Clam clam;
    Veggie veggie;
    Pepperoni pepperoni;
    /*
     * This is copied from provided stub code but it is missing variables
     * Veggie veggie;
     * Pepperoni pepperoni;
     */
    abstract void prepare();
    void bake() {System.out.println("Bake for 25 minutes at 350"); }
    void cut() {System.out.println("Cutting the pizza into diagonal slices");}
    void box() {System.out.println("Place pizza in official PizzaStore box");}
    void setName(String name) { this.name = name;}
    String getName() { return name;}

    public String toString() {
        // code to print pizza here
        return name + " with " + dough.toString() + ", " + sauce.toString() + ", "; 
    }
}
