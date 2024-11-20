package org.example;

public interface OutfitRequirements {
    Top createTop();
    Pants createPants();
    Shoes createShoes();
}

interface Top {
    void display();
}

interface Pants {
    void display();
}

interface Shoes {
    void display();
}
