package casual;

import org.example.OutfitRequirements;
import org.example.Pants;
import org.example.Shoes;
import org.example.Top;

public class CasualFactory implements OutfitRequirements {

        @Override
        public Top createTop() {
            return new CasualTop();
        }

        @Override
        public Pants createPants() {
            return new CasualPants();
        }

        @Override
        public Shoes createShoes() {
            return new CasualShoes();
        }
    }
}
