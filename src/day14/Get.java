//getter setter using private methods and variables 
package day14;

public class Get{
  private String s;
  private int age = 33;
  private String name;

  

  public void setter(String name,int age,String s){
     this.name = name;
     this.age = age;
     this.s = s;
  }

  public String get(){
    return name + " " + age + " " + s ;
    
  }

  public static void main(String[] args)
{
  
  Get g1 = new Get();
  g1.setter("mohan", 23, "delhi");
  System.out.println(g1.get());

}
 
}
  

