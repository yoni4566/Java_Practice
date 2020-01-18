package chapter05;

public class Order {
    public int orderNum;
    public String customerId;
    public String orderDate;
    public String customerName;
    public String orderProductNum;
    public String address;

    public Order(int orderNum, String customerId, String orderDate, String customerName, String orderProductNum, String address) {
        this.orderNum = orderNum;
        this.customerId = customerId;
        this.orderDate = orderDate;
        this.customerName = customerName;
        this.orderProductNum = orderProductNum;
        this.address = address;
    }

    public void printOrderInfo() {
        System.out.println("주문번호 : " + orderNum);
        System.out.println("주문자아이디 : " + customerId);
        System.out.println("주문날짜 : " + orderDate);
        System.out.println("주문자이름 : " + customerName);
        System.out.println("주문상품번호 : " + orderProductNum);
        System.out.println("배송주소 : " + address);
    }
}
