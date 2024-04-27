package class1;

/**
 * packageName : class1
 * fileName : ClassStart3
 * author : hayj6
 * date : 2024-04-27(027)
 * description :
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-04-27(027)         hayj6          최초 생성
 */
public class ProductOrderMain {
    public static void main(String[] args) {
        ProductOrder[] orders = new ProductOrder[3];

        ProductOrder productOrder1 = new ProductOrder();
        ProductOrder productOrder2 = new ProductOrder();
        ProductOrder productOrder3 = new ProductOrder();

        productOrder1.productName = "두부";
        productOrder1.price = 2000;
        productOrder1.quantity = 2;
        orders[0] = productOrder1;

        productOrder2.productName = "김치";
        productOrder2.price = 5000;
        productOrder2.quantity = 1;
        orders[1] = productOrder2;

        productOrder3.productName = "콜라";
        productOrder3.price = 1500;
        productOrder3.quantity = 2;
        orders[2] = productOrder3;

        int totalAmount = 0;
        for (ProductOrder p : orders) {
            System.out.println(" 상품명 : " + p.productName + " 가격 : " + p.price + " 수량 : " + p.quantity);
            totalAmount = totalAmount + p.price * p.quantity;
        }
        System.out.println("총 결제 금액 : " + totalAmount);
    }
}
