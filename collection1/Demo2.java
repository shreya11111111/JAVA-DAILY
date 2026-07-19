package collection1;
import java.util.ArrayList;
public class Demo2 {

  public static void main(String[] args) {
      ArrayList<String> bat = new ArrayList<>();
      bat.add("virat");
      bat.add("ghambhir");
      bat.add("hardik");
      bat.add("jadeja") ;     
 

  ArrayList<String> bow = new ArrayList<>();
      bow.add("shami");
      bow.add("jadeja");
      bow.add("hardik");
      bow.add("ishant");

      bat.retainAll(bow);
      System.out.println(bat);

      ArrayList<String> all = new ArrayList<>();
      all.addAll(bat);
      all.retainAll(bow);
      System.out.println(all);
      System.out.println(bat);
      System.out.println(bow); 

      //you have given a collection of batsman and bowler.Remove all the allrounder
      //from collection 
}

}
