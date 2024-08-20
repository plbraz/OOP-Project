# PetShop Project Documentation

## Overview

The PetShop project is a system for managing pet shop products, including food, collars, bowls, treats, and more. The system allows for the registration and manipulation of these product categories and their specific characteristics.

## Directory Structure

The project is organized as follows:

src/
com/
petshop/
project/
# main/
- Menu.java
# models/
- Produtos.java
- Coleiras.java
- Potes.java
- Petiscos.java
- Racoes.java
- Compra.java
# utils/
- Array.java

## Package and Class Descriptions

### Package `com.petshop.project.main`

- **`Menu.java`**: The main class responsible for displaying the menu and managing user interaction with the system.

### Package `com.petshop.project.models`

- **`Produtos.java`**: The base class for all products in the system. It defines common attributes such as `brand`, `model`, and `price`.
- **`Coleiras.java`**: Subclass of `Produtos` representing collars. Includes specific attributes and methods for collars.
- **`Potes.java`**: Subclass of `Produtos` representing bowls. Includes specific attributes and methods for bowls.
- **`Petiscos.java`**: Subclass of `Produtos` representing treats. Includes specific attributes and methods for treats.
- **`Racoes.java`**: Subclass of `Produtos` representing pet food. Includes specific attributes and methods for pet food.
- **`Compra.java`**: Class managing product purchases.

### Package `com.petshop.project.utils`

- **`Array.java`**: Utility class for array manipulation, such as adding and listing products.

## Class Documentation

### `Racoes` Class

- **Package**: `com.petshop.project.models`
- **Description**: Represents pet food products. Extends the `Produtos` class and includes specific attributes and methods for pet food.
- **Key Methods**:
  - `CadastrarR(String brand, String model, double price, String weight)`: Registers a new pet food product.
  - `EntradaDadosR()`: Handles user input to register a pet food product.
  - `ImprimirR()`: Returns a string representation of the pet food product.

### `Produtos` Class

- **Package**: `com.petshop.project.models`
- **Description**: Base class for all products. Defines common attributes and methods for products.
- **Key Attributes**:
  - `model`: The model of the product.
  - `price`: The price of the product.
  - `brand`: The brand of the product.
- **Key Methods**:
  - `setModel(String model)`: Sets the model of the product.
  - `setPrice(double price)`: Sets the price of the product.
  - `setBrand(String brand)`: Sets the brand of the product.

### `Array` Class

- **Package**: `com.petshop.project.utils`
- **Description**: Provides utility methods for manipulating arrays of products.
- **Key Methods**:
  - `adicionar(Produtos product)`: Adds a product to the array.
  - `listar()`: Returns the list of products.

## Usage Instructions

### Compilation and Execution

1. Navigate to the root directory of the project.
2. Compile the code with:
   ```bash
   javac src/com/petshop/project/**/*.java
3. Run the program with:
   ```bash
   java com.petshop.project.main.Menu

