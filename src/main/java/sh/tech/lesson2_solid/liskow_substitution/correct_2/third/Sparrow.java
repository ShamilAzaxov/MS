package sh.tech.lesson2_solid.liskow_substitution.correct_2.third;

public class Sparrow extends Bird{
   private final FlyingAbility flyingAbility = new SparrowFlying();
    public void fly(){
        flyingAbility.fly();
    }
}
