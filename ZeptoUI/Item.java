package fourteenjuly2026;
public abstract class  Item implements Product {
  String name;
  double price;
  int qty;
  public Item(String name , double price , int qty ){
    this.name = name;
    this.price = price;
    this.qty = qty;
    
  }
  @Override
  public double getTotalPrice(){

    return price * qty;

  }
  @Override 
  public void display(){
    System.out.println("Name\t:\t" + name);

  }
  System.out.println("Price")
  
}
