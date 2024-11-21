

# Garment Simulator

This project simulates the creation of a garment family (Top, Pants, Shoes) with different variants for various occasions such as "Professional," "Casual," and "Party." The goal is to ensure that garments from the same family are always consistent with one another. This is achieved by using the **Abstract Factory** design pattern, which allows you to create families of related products (garments) without changing the core code when new variants are added.

## Design Pattern

### **Abstract Factory**
The **Abstract Factory** design pattern provides an interface for creating families of related or dependent objects without specifying their concrete classes. In this project, the `OutfitRequirements` interface defines methods for creating different types of garments (Top, Pants, and Shoes), and each concrete factory (e.g., `ProfessionalFactory`, `CasualFactory`, `PartyFactory`) implements this interface to create objects from a specific family.

### **How it works**
- The project consists of multiple classes for each garment type (Top, Pants, Shoes) and their corresponding variants for different occasions (Professional, Casual, Party).
- The Abstract Factory pattern ensures that each garment family (e.g., `ProfessionalFactory`) creates matching products (e.g., `ProTop`, `ProPants`, `ProShoes`).
- You can easily add new product families or variants without modifying existing code, which is a key benefit when dealing with frequent catalog updates.

## Folder Structure

```
.
├── org
│   └── example
│       ├── OutfitRequirements.java      # Interface for creating garment products
│       ├── Top.java                     # Interface for Top garment
│       ├── Pants.java                   # Interface for Pants garment
│       └── Shoes.java                   # Interface for Shoes garment
├── casual
│   ├── CasualFactory.java              # Factory to create Casual garments
│   ├── CasualTop.java                  # Casual variant of the Top
│   ├── CasualPants.java                # Casual variant of the Pants
│   └── CasualShoes.java                # Casual variant of the Shoes
├── professional
│   ├── ProfessionalFactory.java        # Factory to create Professional garments
│   ├── ProTop.java                     # Professional variant of the Top
│   ├── ProPants.java                   # Professional variant of the Pants
│   └── ProShoes.java                   # Professional variant of the Shoes
└── party
    ├── PartyFactory.java              # Factory to create Party garments
    ├── PartyTop.java                   # Party variant of the Top
    ├── PartyPants.java                 # Party variant of the Pants
    └── PartyShoes.java                 # Party variant of the Shoes
```

## How to Use

### Prerequisites
1. JDK 8 or higher
2. A text editor or IDE (e.g., IntelliJ IDEA, Eclipse)
3. Command line (optional)

### Running the Code

1. Clone or download the repository.
2. Open the project in your favorite IDE or text editor.
3. In the `Driver.java` (or equivalent main class), you can test the functionality by creating garment families:

```java
public class Driver {
    public static void main(String[] args) {
        // Create a Professional Outfit
        OutfitRequirements professionalOutfit = new ProfessionalFactory();
        professionalOutfit.createTop().display();
        professionalOutfit.createPants().display();
        professionalOutfit.createShoes().display();
        
        // Create a Casual Outfit
        OutfitRequirements casualOutfit = new CasualFactory();
        casualOutfit.createTop().display();
        casualOutfit.createPants().display();
        casualOutfit.createShoes().display();
        
        // Create a Party Outfit
        OutfitRequirements partyOutfit = new PartyFactory();
        partyOutfit.createTop().display();
        partyOutfit.createPants().display();
        partyOutfit.createShoes().display();
    }
}
```

4. Run the `Driver.java` file, and you'll see the output for each family:

```
Professional Top
Professional Pants
Professional Shoes
Casual Top
Casual Pants
Casual Shoes
Party Top
Party Pants
Party Shoes
```

## Key Features

- **Abstract Factory Pattern**: Allows you to create consistent product families (garments) without changing existing code.
- **Flexible and Extensible**: Easily add new product families or variants without modifying the core code.
- **Separation of Concerns**: The factory class handles the creation of objects, ensuring the client code doesn't need to know about the concrete classes.

## Project Structure

- **`OutfitRequirements` interface**: Declares methods for creating the garment family products (Top, Pants, Shoes).
- **Product Interfaces (`Top`, `Pants`, `Shoes`)**: Defines the behavior for each product.
- **Concrete Factories**: `ProfessionalFactory`, `CasualFactory`, `PartyFactory` each implement the `OutfitRequirements` interface and provide concrete implementations to create garments from their respective family.
- **Concrete Products**: `ProTop`, `CasualTop`, `PartyTop`, `ProPants`, `CasualPants`, `PartyPants`, `ProShoes`, `CasualShoes`, `PartyShoes` implement the `Top`, `Pants`, and `Shoes` interfaces.

## Contributing

1. Fork the repository.
2. Create a new branch (`git checkout -b feature-branch`).
3. Make your changes.
4. Commit your changes (`git commit -am 'Add new feature'`).
5. Push to the branch (`git push origin feature-branch`).
6. Create a pull request.

