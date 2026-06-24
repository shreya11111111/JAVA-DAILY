package day11;

public class ConstController {


  //we are using the constructor of const class here new Const() . we can use in other class the constructor of other class . 
public static void main(String[] args){
    
    Const c = new Const("Shreya", "niet ");
    Const c2 = new Const(c.college , c.name );
    c2.college = c.college ; //copy of c1 object it will remain unchanged if we even change c bcz its a copy . 
    c2.name = c.name;

    System.out.println(c2.name + c2.college);
    System.out.println(c.name + c.college);
    Const c3 = new Const(c.name , c.college);
    System.out.println(c3.name + c3.college);
    

  }
 


    
  
}
