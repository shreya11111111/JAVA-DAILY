package fourteenjuly2026;
import java.util.ArrayList;
import java.util.Scanner;
public class ZeptoUI{
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    static ArrayList<Product> cart  = new ArrayList<>();
    public static void addToCart(Product item){
      if(item != null){
        cart.add(item);
        System.out.println("item is added to cart");
        return;
      }
      System.out.println("invalid item cant be added into cart");
    }
    public static void showCart(){

      if(cart.isEmpty()){
        System.out.println("your cart is empty please add items!!");
        return;
      }
      System.out.println("\t\t--------Cart Items------------\t\t");
      for(int i = 0 ; i <= cart.size() -1 ; i++){
        System.out.println(i+1 + "."+cart.get(i));
      }

    }


    public static void getDiscount(){         
      for(int i = 0 ; i <= n ; i++){
        return ;

      }
      //travel inside cart 
      //find out total bill amount 
      //check if(BillAmount > 1000) ---> 100rs discount 
      //elseif(BillAmount > 2000) --->10%discount 
      //condition 
      return 0.0; //if no discount
    }


    public static void placeOrder(){
      //travel insdie cart 
      //find out total bill amount
      //then call discountmethod and the final bill
      //pay amount 
      //order placed
      //after placing order empty your cart...
      
    }
    
    

  while(true){
    System.out.println("Press 1 to Add item");
    System.out.println("Press 2 to Add item");
    System.out.println("Press 0 to Add item");
    int taskInput = sc.nextInt();
    if(taskInput == 0){
      System.out.println("-----thankyou-----");
    }
    if(taskInput == 1){
      System.out.println("-----select any below options to add Cart--------");
      System.out.println("Press 1 to Add Vegetables");
      System.out.println("Press 2 to Add Fruits");
      System.out.println("Press 3 to Add Drinks");

      int catInput = sc.nextInt();
      Product item = null;
      if(catInput == 1){
        System.out.println("-----List of Vegetables-------");
        System.out.println("Press 1 for Peas");
        System.out.println("Press 2 for chillies");
        int itemInput = sc.nextInt();
        if(itemInput == 1 ){
          System.out.println("Enter peas qty in kgs");
          item = new Peas(sc.nextInt());

        }

      }

      }
    }

  }




}


 
