package sh.tech.lesson2_solid.dependency_inversion.broken;

public class MySQL {
    public void save(ModelForm modelForm) {
        System.out.println("save to db form " + modelForm);
    }

    public void save(Loan loan) {
        System.out.println("save to db loan " + loan);
    }

    public void save(Order order) {
        System.out.println("save to db order " + order);
    }

    public void save(Payment payment) {
        System.out.println("save to db payment " + payment);
    }
}
