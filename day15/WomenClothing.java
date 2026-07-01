package day15;

public class WomenClothing  extends Cloth{
  public WomenClothing(int productId ,String   name , double price , String fabricType){
    super( productId , name , price , fabricType );
  }

  
  public void Display(){
    
    System.out.println("displaying all the details of women");
    }
  
}
