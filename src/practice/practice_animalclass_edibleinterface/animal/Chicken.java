package practice.practice_animalclass_edibleinterface.animal;

import practice.practice_animalclass_edibleinterface.edible.Edible;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "Chicken: Cục tác...cục tác...cục tác...";
    }

    @Override
    public String howToEat() {
        return "could be fried";
    }
}
