package section7_access.ex;

public class ShoppingCartMain {

    public static void main(String[] args) {
        ShoppingCart c = new ShoppingCart();

        Item item1 = new Item("새콤달콤", 1000, 20);
        Item item2 = new Item("제로펩시라임", 2500, 25);
        Item item3 = new Item("가나초콜릿", 2000, 13);
        Item item4 = new Item("롯데빼빼로", 1700, 10);

        c.addItem(item1);
        c.addItem(item2);
        c.addItem(item3);
        c.addItem(item4);

        c.displayItem();

    }
}
