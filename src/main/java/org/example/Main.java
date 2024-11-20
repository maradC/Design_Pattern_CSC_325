package org.example;

import party.PartyFactory;
//Driver Class

public class Main {
    public static void main(String[] args) {
        OutfitRequirements partyFactory = new PartyFactory();

        Top partyTop = partyFactory.createTop();
        Pants partyPants = partyFactory.createPants();
        Shoes partyShoes = partyFactory.createShoes();

        // Display the Party outfit
        System.out.println("Party Outfit:");
        partyTop.display();
        partyPants.display();
        partyShoes.display();

        //Purposely to give an issue

        OutfitRequirements professionalFactory = new ProfessionalFactory();

        Top casualTop = professionalFactory.createTop();
        Pants casualPants = professionalFactory.createPants();
        Shoes casualShoes = professionalFactory.createShoes();

        // Display the incorrectly paired outfit
        System.out.println("\nInconsistent Outfit:");
        casualTop.display();
        casualPants.display();
        casualShoes.display();
    }
}



