
//create 2 non static variable of character type storing some alphabets 
//now inside main method perform addition with both the characters value and store the results 

package day5;

public class ns {

  char c = 'a';
  char C = 'A';
  public static void main(String[] args){
    ns sum = new ns();
    int  add = sum.c + sum.C;
    System.out.println(add);
  }
  
}
