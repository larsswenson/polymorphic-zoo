# Polymorphic Zoo

## Description
This Java project demonstrates polymorphism using a zoo scenario. It includes an abstract base class `Animal` and three derived classes: `Lion`, `Elephant`, and `Monkey`. 
Each derived class overrides the `makeSound()` method to provide a unique animal sound. 
The project also demonstrates method overloading by adding a version of `makeSound` in the `Animal` class that takes an integer representing the number of times the animal should make its sound.

## Project Structure
- `Animal.java`: Abstract base class with an abstract method `makeSound()` and a concrete method `makeSound(int)`.
- `Lion.java`: Derived class that extends `Animal` and overrides `makeSound()` to print "Roar".
- `Elephant.java`: Derived class that extends `Animal` and overrides `makeSound()` to print "Trumpet".
- `Monkey.java`: Derived class that extends `Animal` and overrides `makeSound()` to print "Ooh Ooh Aah Aah".
- `ZooDemo.java`: Contains the `main` method to demonstrate polymorphism. It creates instances of each animal, adds them to an `ArrayList`, and calls both versions of the `makeSound` method on each animal.

## How to Run

1. **Ensure all the Java files are in the same directory:**
    - `Animal.java`
    - `Lion.java`
    - `Elephant.java`
    - `Monkey.java`
    - `ZooDemo.java`

2. **Open a terminal or command prompt and navigate to the directory containing the files.**

3. **Compile the Java files using the following command:**
    ```sh
    javac Animal.java Lion.java Elephant.java Monkey.java ZooDemo.java
    ```

4. **Run the `ZooDemo` class:**
    ```sh
    java ZooDemo
    ```

## Expected Output

Leo says:
Roar
Roar Roar Roar

Horton says:
Trumpet
Trumpet Trumpet Trumpet

George says:
Ooh Ooh Aah Aah
Ooh Ooh Aah Aah Ooh Ooh Aah Aah Ooh Ooh Aah Aah


This demonstrates polymorphism, as `makeSound()` is processed differently depending on the class that invokes it.
