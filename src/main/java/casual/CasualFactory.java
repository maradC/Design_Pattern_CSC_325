package casual;

import org.example.OutfitRequirements;
import org.example.Pants;
import org.example.Shoes;
import org.example.Top;

public class CasualFactory implements OutfitRequirements {

    /**
     * Creates a casual top garment.
     * This method is responsible for creating a specific top product that is part of the Casual family.
     *
     * @return a {@link Top} object representing a casual top.
     */
    @Override
    public Top createTop() {
        // Return a new instance of CasualTop
        return new CasualTop();
    }

    /**
     * Creates casual pants garment.
     * This method is responsible for creating a specific pants product that is part of the Casual family.
     *
     * @return a {@link Pants} object representing casual pants.
     */
    @Override
    public Pants createPants() {
        // Return a new instance of CasualPants
        return new CasualPants();
    }

    /**
     * Creates casual shoes garment.
     * This method is responsible for creating a specific shoes product that is part of the Casual family.
     *
     * @return a {@link Shoes} object representing casual shoes.
     */
    @Override
    public Shoes createShoes() {
        // Return a new instance of CasualShoes
        return new CasualShoes();
    }
}
