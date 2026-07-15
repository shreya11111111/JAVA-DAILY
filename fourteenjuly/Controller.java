package fourteenjuly;
public class Controller {
  public static void main(String[] args) {
    Student st = new Student(121 ,"teena", 33 ,"c-4", "ring road" , "ghaziabad"  , 234 , "UP");
    System.out.println(st);
    Student1 s1 = new Student1("Shreya" ,44 ,  2199999, new Marksheet(90 , 95 ,99 , 45));
    System.out.println(s1.name);
    System.out.println(s1.mk.getFinalGrade());
    System.out.println(s1.mk.getPercentage());



  }
}
