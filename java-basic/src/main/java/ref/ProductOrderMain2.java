package ref;

/**
 * packageName : ref
 * fileName : ProductOrderMain2
 * author : hayj6
 * date : 2024-05-01(001)
 * description :
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-05-01(001)         hayj6          최초 생성
 */
public class ProductOrderMain2 {
    public static void main(String[] args) {
        ProductOrder[] orders = new ProductOrder[3];
        orders[0] = createOrder("두부", 2000, 2);
        orders[1] = createOrder("김치", 5000, 1);
        orders[2] = createOrder("콜라", 1500, 2);

        printOrder(orders);
        int totalAmount = getTotalAmount(orders);
        System.out.println("총 결제 금액 : " + totalAmount);
    }

    static int getTotalAmount(ProductOrder[] orders) {
        int totalAmount = 0;
        for (ProductOrder order : orders){
            totalAmount = totalAmount + order.price * order.quantity;
        }
        return totalAmount;
    }

    static void printOrder(ProductOrder[] orders) {
        for (ProductOrder order : orders){
            System.out.println("상품명 : " + order.productName + ", 가격 : "+ order.price + ", 수량 : " + order.quantity);
        }
    }

    static ProductOrder createOrder(String productName, int price, int quantity) {
        ProductOrder order = new ProductOrder();
        order.productName = productName;
        order.price = price;
        order.quantity = quantity;
        return order;
    }

}
