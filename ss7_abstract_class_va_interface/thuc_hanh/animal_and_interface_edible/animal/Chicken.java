package ss7_abstract_class_va_interface.thuc_hanh.animal_and_interface_edible.animal;

import ss7_abstract_class_va_interface.thuc_hanh.animal_and_interface_edible.Edible;
import ss7_abstract_class_va_interface.thuc_hanh.animal_and_interface_edible.animal.Animal;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "Chicken: cluck-cluck";
    }

    @Override
    public String howToEat() {
        return "could be fried";
    }
}
