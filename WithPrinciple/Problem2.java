package WithPrinciple;

class Item {
    private String item;

    public Item(String item){
        this.item = item;
    }

    public String getItem(){
        return item;
    }
}

class Order {
    private Item item;

    public Order(String itemName){
        this.item = new Item(itemName);
    }

    public void displayOrder(){
        System.out.println("\n item : " + item.getItem());
    }
}


public class Problem2 {
    public static void main(String[] args){
        Order order = new Order("laptop");
        order.displayOrder();
    }
}
