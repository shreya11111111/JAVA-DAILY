package day11;
class Const{
   String name ;
  String college; 

public Const(String name , String college){ //constructor 
    this.name = name; 
    this.college  = college;
  }
  //we can also write here 
  public static void main(String[] args){
    
    Const c1 = new Const("Shreya", "niet ");
    System.out.println(c1.name + c1.college);
  }

  }

