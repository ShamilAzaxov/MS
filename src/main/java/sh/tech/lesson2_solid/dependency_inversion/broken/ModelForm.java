package sh.tech.lesson2_solid.dependency_inversion.broken;

public class ModelForm {
    private Long id;
    private int age;

    @Override
    public String toString() {
        return "ModelForm{" +
                "id=" + id +
                ", age=" + age +
                '}';
    }
}
