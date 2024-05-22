package sh.tech.lesson2_solid.dependency_inversion.correct;

public class WebFramework {
    public void save(FormInterface form){
        SQLInterface db = new OracleSQL();
        db.save(form);
    }
}
