package sh.tech.lesson2_solid.open_closed.correct;

public class SaveOrderToDb implements Save{
    @Override
    public void saveOrder(Order order) {
        System.out.println("Save order to db id: " + order.getId() + " address: " + order.getAddress());
    }
}
