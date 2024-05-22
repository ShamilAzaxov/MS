package sh.tech.lesson2_solid.liskow_substitution.correct_2.second;

import sh.tech.lesson2_solid.liskow_substitution.correct_2.first.Bird;

public class Sparrow extends Bird implements Flyable {
    @Override
    public void fly() {
        System.out.println("Sparrow flies");
    }
}
