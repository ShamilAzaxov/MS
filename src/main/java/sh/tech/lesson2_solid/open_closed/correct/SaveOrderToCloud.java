package sh.tech.lesson2_solid.open_closed.correct;

public class SaveOrderToCloud implements Save {
    @Override
    public void saveOrder(Order order) {
        System.out.println("Save order to cloud id: " + order.getId() + " address: " + order.getAddress());
    }
}
