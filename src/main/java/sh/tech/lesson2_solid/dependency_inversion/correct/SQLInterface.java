package sh.tech.lesson2_solid.dependency_inversion.correct;

public interface SQLInterface {
    void save(FormInterface form);
}
