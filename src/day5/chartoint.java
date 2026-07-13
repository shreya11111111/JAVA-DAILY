//write a java program to convert a character into a number \
package day5;

class chartoint{

public static void main(String[] args){


//1st way 
  int num = 'a'; //char -- int directly we can do 
  System.out.println(num);//output will be  number 97
//2nd way 
char c = 'a';
System.out.println(c);

int a =  c;      //widening conversion it will automatically convert from char to int through complier
System.out.println(a);

}}