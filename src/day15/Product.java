package day15;

public class Product {
  int productId ;
  String name;
  double price;

  public Product(){  //initilialized by jvm interally if no constructor in class 

  }

  public Product(int productId , String  name , double price){
    this.productId = productId;
    this.name = name;
    this.price = price;
  }
  public void Display(){
    System.out.println("display  of product ");
    
    }
  

  

}
