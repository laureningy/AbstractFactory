import java.util.Scanner;
public class MyPizzaApp{

    public static void main(String args[]){
        Scanner scnr = new Scanner(System.in);
        System.out.println("Welcome to MyPizzaApp");
        while(true){
            
            System.out.println("What type of Pizza? (NewYork, Chicago, exit to exit)");
            String line = scnr.next();
            if(line.equals("exit")){
                break;
            }
            if(line.equals( "NewYork")){
                PizzaStore nyPizzaStore = new NYPizzaStore();
                System.out.println("What type of pizza? (cheese, pepperoni, veggie, clam, exit to exit)");
                String type = scnr.next();
                if(type.equals("exit")){
                    break;
                }
                else if(type.equals("cheese") || type.equals("pepperoni") || type.equals("veggie") || type.equals("clam")){
                    System.out.println(nyPizzaStore.orderPizza(type));
                   
                }
                else{
                    System.out.println("Try again.");
                }  
            }
            else if(line.equals("Chicago")){
                PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();
                System.out.println("What type of pizza? (cheese, pepperoni, veggie, clam, exit to exit)");
                String type = scnr.next();
                if(type.equals("exit")){
                    break;
                }
                else if(type.equals("cheese") || type.equals("pepperoni") || type.equals("veggie") || type.equals("clam")){
                    System.out.println(chicagoPizzaStore.orderPizza(type));
                   
                }
                else{
                    System.out.println("Try again.");
                }    
            }
            else{
                System.out.println("Try again, invalid input");
            }
        }
        scnr.close();
        
       // PizzaStore nyPizzaStore = new NYPizzaStore();
       // System.out.println(nyPizzaStore.orderPizza("veggie"));
    }
}