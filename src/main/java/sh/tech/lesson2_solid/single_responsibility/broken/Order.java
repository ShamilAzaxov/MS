package sh.tech.lesson2_solid.single_responsibility.broken;

public class Order {
    private Long id;
    private String address;

    public Order(Long id, String address) {
        this.id = id;
        this.address = address;
    }

    public void saveOrder(){
        System.out.println("Order saved");
    }

    public void saveCredit(Credit credit){
        System.out.println(credit + " saved");
    }
}
