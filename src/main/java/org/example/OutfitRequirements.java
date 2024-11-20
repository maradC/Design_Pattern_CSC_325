package org.example;

public interface OutfitRequirements {
    Top createTop();
    Pants createPants();
    Shoes createShoes();
}

public interface Top {
    void display();
}

public interface Pants {
    void display();
}

public interface Shoes {
    void display();
}
