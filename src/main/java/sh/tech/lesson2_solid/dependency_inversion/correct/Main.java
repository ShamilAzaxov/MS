package sh.tech.lesson2_solid.dependency_inversion.correct;

public class Main {
    public static void main(String[] args) {
        WebFramework webFramework = new WebFramework();
        webFramework.save(new Payment());
        webFramework.save(new Order());
        webFramework.save(new Loan());
        webFramework.save(new ModelForm());

    }
}
