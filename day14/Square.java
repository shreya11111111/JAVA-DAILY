package day14;

 class Square extends Shape {
  int side;
  public Square(int shapeId , String ShapeName , int side){
  super(1 , "square" );
  this.side = side ;
}



  public void findArea(){
    System.out.println("findArea of square  child class");
  }
  public void findPerimeter(){
    System.out.println("findperimeter  of square child class ");
  }
  
}
