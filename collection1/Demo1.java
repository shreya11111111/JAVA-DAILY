package collection1;
import java.util.ArrayList;
public class Demo1 {
 
  public static void main(String[] args) {
      
     ArrayList<String> veg = new ArrayList<String>();
     veg.add("tomato");
     veg.add("Panner");
     veg.add("Dal");
     veg.add("Orange");
     veg.add("Apple");
     veg.add("Grapes");
     veg.add("Dal");

     for(Object o:veg){
      System.out.println(o);
     }
     System.out.println("--------------------------");

     for(String o: veg){
      if(o.charAt(o.length()-1) == 'o'){
        System.out.println(o);
      }
     }



     


  }
}
