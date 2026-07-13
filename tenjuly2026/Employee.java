
package tenjuly2026;

public class Employee {
  int id ;
  String name ;
  int age ;
  long phoneno;
  double Salary;
  int  YOJ ; 



  public Employee(int id ,
  String name ,
  int age ,
  long phoneno,
  double Salary,
  int  YOJ ){
    this.id = id;
    this.name = name;
    this.age = age;
    this.phoneno = phoneno;
    this.Salary = Salary;
    this.YOJ = YOJ;

  }

  public static void main(String[] args){
    Employee E = new Employee(1 , "shreya" , 19 , 234567776 , 20 , 2006);
     Employee E1 = new Employee(4 , "shriya" , 191 , 234567776 , 9 , 2005);
      Employee E2 = new Employee(3, "advant" , 193 , 200567776 , 90 , 2004);
       Employee E3 = new Employee(6, "Rohit" , 10 , 200567776 , 900 , 2007);
        Employee E4 = new Employee(8, "Mohit" , 14 , 267776 , 9000 , 2010);

      
        





  }
  @Override
  public String toString(){
    return "{" + id + ","+ name + "}";

  }


 
  
}
