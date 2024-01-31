class  Item
{
    String name;
    double price;
    int quantity;
    public Item(String name,double price,int quantity)
	{
        this.name=name;
        this.price=price;
        this.quantity=quantity;
    }
    public String getName()
	{
        return name;
    }
    public double getPrice()
	{
        return price;
    }
    public int getQuantity()
	{
       return quantity;
    }
    public double getValue()
	{
        return quantity*price;
    }
}
public class Inventory 
{
    public static void main(String args[]) 
	{
		Item item1 = new Item("Shirt", 19.99, 10);
        Item item2 = new Item("Jeans", 39.99, 5);
        Item item3 = new Item("Shoes", 59.99, 3);
		
        System.out.println("Store Inventory:");
        System.out.println("Item\tPrice\tQuantity\t\tValue");
        System.out.println(item1.getName() + "\t$" + item1.getPrice() + "\t" + item1.getQuantity()+"\t\t$"+item1.getValue());
        System.out.println(item2.getName() + "\t$" + item2.getPrice() + "\t" + item2.getQuantity()+"\t\t$" +item2.getValue());
        System.out.println(item3.getName() + "\t$" + item3.getPrice() + "\t" + item3.getQuantity()+"\t\t$" +item3.getValue());
        double totalValue = item1.getValue() + item2.getValue() + item3.getValue();
        System.out.println("Total Inventory Value: $" + totalValue);
	}
}