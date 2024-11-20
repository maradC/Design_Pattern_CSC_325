package org.example;

public class ProfessionalFactory implements OutfitRequirements {
    @Override
    public Top createTop() {
        return new ProTop();
    }

    @Override
    public Pants createPants() {
        return new ProfessionalPants();
    }

    @Override
    public Shoes createShoes() {
        return new ProfessionalShoes();
    }
}
