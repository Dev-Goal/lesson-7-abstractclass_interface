package practice.practice_animalclass_edibleinterface;

import practice.practice_animalclass_edibleinterface.animal.Animal;
import practice.practice_animalclass_edibleinterface.animal.Chicken;
import practice.practice_animalclass_edibleinterface.animal.Tiger;
import practice.practice_animalclass_edibleinterface.edible.Edible;
import practice.practice_animalclass_edibleinterface.fruit.Apple;
import practice.practice_animalclass_edibleinterface.fruit.Fruit;
import practice.practice_animalclass_edibleinterface.fruit.Orange;

public class AbstractAndInterfaceTests {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal animal : animals) {
            System.out.println(animal.makeSound());
            if (animal instanceof Chicken) {
                Edible edible = (Chicken) animal;
                System.out.println(edible.howToEat());
            }
        }

        Fruit[] fruits = new Fruit[2];
        fruits[0] = new Apple();
        fruits[1] = new Orange();
        for (Fruit fruit : fruits) {
            System.out.println(fruit.howToEat());
        }
    }
}
