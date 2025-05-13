# 🚴‍♂️ Bike System Project

This project demonstrates object-oriented programming (OOP) principles in Java by modeling a bike system. It includes different types of bicycles (like MountainBike and TandemBike), their behaviors, and inheritance from an abstract superclass. It also includes a base `Vehicle` class, showing how other vehicles like `Car` relate to the `Bike` class using class hierarchies.

---

## 📚 Features

- Object-Oriented Design using:
  - **Abstract classes**
  - **Method Overriding**
  - **Polymorphism**
  - **Inheritance**
- Models multiple bike types with specialized behavior.
- Demonstrates use of abstract methods like:
  - `brake()`
  - `accelerate()`
  - `slowDown()`
  - `turn()`
  - `shift()`
- Includes a `Vehicle` superclass and a `Car` class to show class relationships.

---

## 🛠 Classes Overview

- `Vehicle`: The top-level class representing any vehicle.
- `Bike` *(abstract)*: Inherits from `Vehicle`; contains common bike attributes and abstract methods.
- `MountainBike`: Specialized bike with suspension info.
- `TandemBike`: Represents a bike designed for two riders.
- `RoadBike`, `ElectricBike`, etc.: Other bike variants with specific behavior.
- `Car`: Inherits from `Vehicle`; demonstrates parallel vehicle design.
- `Main`: Contains the `main()` method to test polymorphism and behaviors.

---

## 💻 How to Run

1. Open the project in **Eclipse**.
2. Make sure all classes are in the same package (`bikesystem`).
3. Run `Main.java`.

---

## LICENSE
**MIT License**

