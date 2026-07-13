package day14;

public class Shape {
  int shapeId;
  String ShapeName;



  public Shape(int shapeId , String ShapeName){
    this.shapeId = shapeId;
    this.ShapeName = ShapeName;
  }

 

  public void findArea(){
    System.out.println("findArea of parent class");
  }

  public void findPerimeter(){
    System.out.println("findperimeter of parent class ");
  }
  public void displaydetails(int shapeId , String ShapeName){
    System.out.println("display details ");
  }
  
}
