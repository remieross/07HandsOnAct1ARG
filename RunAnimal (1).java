import java.util.Scanner;

// Abstract class Animal
abstract class Animal {
    // Abstract methods
    public abstract void eat();
    public abstract void sleep();
    public abstract void makeSound();
}

// Bird class
class Bird extends Animal {
    @Override
    public void eat() {
        System.out.println("Birds love to eat seeds and sleep for 10-12 hours a day.");
    }

    @Override
    public void sleep() {
        // No additional text needed here as per the phrasing in the output.
    }

    @Override
    public void makeSound() {
        System.out.println("Tweet tweet");
    }
}

// Cat class
class Cat extends Animal {
    @Override
    public void eat() {
        System.out.println("Cats love to eat fish and sleep for 12-16 hours a day.");
    }

    @Override
    public void sleep() {
        // No additional text needed here as per the phrasing in the output.
    }

    @Override
    public void makeSound() {
        System.out.println("Meow meow");
    }
}

// Dog class
class Dog extends Animal {
    @Override
    public void eat() {
        System.out.println("Dogs love to eat meat and sleep for 10-12 hours a day.");
    }

    @Override
    public void sleep() {
        // No additional text needed here as per the phrasing in the output.
    }

    @Override
    public void makeSound() {
        System.out.println("Woof woof");
    }
}

// Main class
public class RunAnimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose an animal. Press B for Bird, C for Cat, or D for Dog: ");
        String choice = scanner.nextLine();

        Animal animal = null;

        if (choice.equalsIgnoreCase("B")) {
            animal = new Bird();
        } else if (choice.equalsIgnoreCase("C")) {
            animal = new Cat();
        } else if (choice.equalsIgnoreCase("D")) {
            animal = new Dog();
        } else {
            System.out.println("Invalid choice.");
            return;
        }

        // Display animal behavior
        animal.eat();
        animal.makeSound();

        scanner.close();
    }
}