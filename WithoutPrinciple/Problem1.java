package WithoutPrinciple;

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

    public void setItem(Item item){
        this.item = item;
    }

    public void displayOrder(){
        System.out.println("item : " + item.getItem());
    }

}

public class Problem1 {
    public static void main(String[] args){
        Item item = new Item("laptop");
        Order order = new Order();
        order.setItem(item);
        order.displayOrder();
    }
}