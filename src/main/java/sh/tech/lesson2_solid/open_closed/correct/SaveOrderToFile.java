package sh.tech.lesson2_solid.open_closed.correct;

public class SaveOrderToFile implements Save{
    @Override
    public void saveOrder(Order order) {
        System.out.println("Save order to file id: " + order.getId() + " address: " + order.getAddress());
    }
}
