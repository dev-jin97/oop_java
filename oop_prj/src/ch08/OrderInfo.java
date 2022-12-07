package ch08;

public class OrderInfo {
    // TODO: 2022/12/07 주문 정보 표현
    public int orderId;
    public int phoneNumber;
    public String address;
    public int orderDate;
    public int orderTime;
    public int price;
    public int menuNo;

    public OrderInfo(int orderId, int phoneNumber, String address, int orderDate, int orderTime, int price, int menuNo){
        this.orderId = orderId;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.orderDate = orderDate;
        this.orderTime = orderTime;
        this.price = price;
        this.menuNo = menuNo;
    }

    public void show(){

        System.out.println("주문번호 _ " + orderId + "\n");
    }

}
