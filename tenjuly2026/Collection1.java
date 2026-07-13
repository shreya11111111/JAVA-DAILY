package tenjuly2026;
import java.util.ArrayList;

public class Collection1 {
  public static void main(String[] args){
    ArrayList<String> list  = new ArrayList<String>();
    list.add("Uapanese");
    list.add("German");
    list.add("French");
    list.add("cantonese");
    list.add("Taiwanese");

  
  int start = 0;
  int end = list.size() -1;
  
  /* 
  while(start<=end){
    System.out.println(list.get(start));
    start++;
  }
  System.out.println("---------------------------------------------------");
  start = 0;
  while(start <= end){
    //String element = list.get(start);
    if(list.get(start).length() >= 3 ){
      System.out.println(list.get(start));
      
    }
    start++;
  }  
  System.out.println("---------------------------------------------------");

  

  start = 0 ;
  while(start <= end){
    if(list.get(start).charAt(0) == 'j' || list.get(start).charAt(0) == 'J'  ){
      System.out.println(list.get(start));
    }
    start++;

  }
  System.out.println("---------------------------------------------------");

  */
 /* 
  int count = 0;
  start = 0;
  while(start <= end){
    if(list.get(start).length() <= 4){
      count++;
    }
    start++;
  }
  System.out.println(count);
  */

  System.out.println(langMethod(list));

  
}

public static ArrayList<String> langMethod(ArrayList<String> list){
  ArrayList<String> result   = new ArrayList<>();
  int i = 0 ;
  int j = list.size()-1;
  while(i <= j){
    if(list.get(i).charAt(0) == 'a' || list.get(i).charAt(0) == 'e'||
   list.get(i).charAt(0) == 'i' ||  list.get(i).charAt(0) == 'o'|| list.get(i).charAt(0) == 'u'
  || list.get(i).charAt(0) == 'A'|| list.get(i).charAt(0) == 'E'|| list.get(i).charAt(0) == 'I'
||  list.get(i).charAt(0) == 'O'||  list.get(i).charAt(0) == 'U'){
  result.add(list.get(i));
  }
  i++;
  }
return result;
  }

}
