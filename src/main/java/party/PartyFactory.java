package party;

import org.example.OutfitRequirements;
import org.example.Pants;
import org.example.Shoes;
import org.example.Top;

public class PartyFactory implements OutfitRequirements {
    @Override
    public Top createTop() {
        return new PartyTop();
    }

    @Override
    public Pants createPants() {
        return new PartyPants();
    }

    @Override
    public Shoes createShoes() {
        return new PartyShoes();
    }
}
