package sh.tech.lesson2_solid.dependency_inversion.broken;

public class WebFramework {
    public void save(ModelForm modelForm){
        MySQL db = new MySQL();
        db.save(modelForm);
    }

    public void save(Loan loan){
        MySQL db = new MySQL();
        db.save(loan);
    }

    public void save(Payment payment){
        MySQL db = new MySQL();
        db.save(payment);
    }

    public void save(Order order){
        MySQL db = new MySQL();
        db.save(order);
    }
}
