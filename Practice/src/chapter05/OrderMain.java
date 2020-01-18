package chapter05;

public class OrderMain {

    public static void main(String[] args) {

        Order order = new Order(123456, "customer1", "2020-01-01", "김소연", "A1234", "인천광역시");
        order.printOrderInfo();
    }
}
