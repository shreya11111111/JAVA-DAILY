package day15;

public class Cloth extends Product{
  String fabricType;

  public Cloth(){

  }

  public Cloth(int productId ,String name , double price , String fabricType){
    super(productId, name , price );   //super call .
    this.fabricType = fabricType;
  }
  
    @override
    public void Display(){
      super.Display();   //super keyword . 
    System.out.println("displaying all the details of cloth");
    }

  }


  
  

