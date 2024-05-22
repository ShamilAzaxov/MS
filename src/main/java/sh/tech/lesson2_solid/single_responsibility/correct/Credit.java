package sh.tech.lesson2_solid.single_responsibility.correct;

public class Credit {
    private Long id;
    private double amount;

    public Credit(Long id, double amount) {
        this.id = id;
        this.amount = amount;
    }

    public void saveCredit(Credit credit){
        System.out.println(credit + " saved");
    }
}
