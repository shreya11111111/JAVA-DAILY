import java.util.Scanner;
package day9;
public class product {

  int id;
  String brandName ; //we are writing here so that we can access the names anywhere in the folder 
  double price;
  int yol;


  public static void main(String[] args){
     product result = proD();
     System.out.println(result);
     System.out.println(result.id);
     System.out.println(result.brandName);
     System.out.println(result.price);
     System.out.println(result.yol);

  }

  public static product proD(){
   product p = new product();
   Scanner sc = new Scanner(System.in);
   System.out.println("enter id");
   sc.nextInt();

   
   sc.nextLine();
   System.out.println("enter brandname ");
   p.brandName = sc.nextLine();


   System.out.println("enter brandname ");
   p.price = sc.nextDouble();





   //p.id = 1;
   //p.brandName = "yolo";
   //p.price = 2100.0;
   //p.yol = 2022;
   //System.out.println(p.id);
   return p; 

  }

  
  }


  
}
