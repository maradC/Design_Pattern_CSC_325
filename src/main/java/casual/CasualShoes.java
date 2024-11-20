package casual;

import org.example.Shoes;

public class CasualShoes implements Shoes {
    /**
     * Displays the name of the casual shoes product.
     * This method prints "Casual Shoes" to the console, indicating that this
     * is a casual version of the shoes product.
     */
    @Override
    public void display(){
        System.out.println("Casual Shoes");
    }
}
