package org.example;


public class ProfessionalFactory implements OutfitRequirements {

    /**
     * Creates a professional top product.
     * This method returns an instance of the {@link ProTop} class, which represents
     * a professional version of a top.
     *
     * @return a new {@link ProTop} object.
     */
    @Override
    public Top createTop() {
        return new ProTop();  // Creating and returning a professional top
    }

    /**
     * Creates a professional pants product.
     * This method returns an instance of the {@link ProPants} class, which represents
     * a professional version of pants.
     *
     * @return a new {@link ProPants} object.
     */
    @Override
    public Pants createPants() {
        return new ProPants();  // Creating and returning professional pants
    }

    /**
     * Creates a professional shoes product.
     * This method returns an instance of the {@link ProShoes} class, which represents
     * a professional version of shoes.
     *
     * @return a new {@link ProShoes} object.
     */
    @Override
    public Shoes createShoes() {
        return new ProShoes();  // Creating and returning professional shoes
    }
}
