package party;

import org.example.Shoes;

public class PartyShoes implements Shoes {
    /**
     * Displays the name of the party pants product.
     * This method prints "Party Shoes" to the console, indicating that this
     * is the party version of the Shoes product.
     */
    @Override
    public void display() {
        System.out.println("Party Shoes");
    }
}
