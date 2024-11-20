package party;

import org.example.Pants;

public class PartyPants implements Pants {
    /**
     * Displays the name of the party pants product.
     * This method prints "Party Pants" to the console, indicating that this
     * is the party version of the pants product.
     */
    @Override
    public void display() {
        System.out.println("Party Pants");
    }
}
