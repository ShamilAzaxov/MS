package sh.tech.lesson2_solid.open_closed.broken;

public class SaveOrder {
    public void saveOrderToDb(Order order){
        System.out.println("Save order to db id: " + order.getId() + " address: " + order.getAddress());
    }

    public void saveOrderToCloud(Order order){
        System.out.println("Save order to cloud id: " + order.getId() + " address: " + order.getAddress());
    }

    public void saveOrderToFile(Order order){
        System.out.println("Save order to file id: " + order.getId() + " address: " + order.getAddress());
    }
}
