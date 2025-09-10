/*
6. Write a Java Program to check whether entered City is IT City or Not. Consider Delhi, Mumbai, Kolkatta, Bangalore, Chennai , Hyderabad as IT cities.
*/
import java.util.*;
class ITCity {
  public static void main(String[] args) {
    String city=new Scanner(System.in).next();
    List<String> list=Arrays.asList("Delhi","Mumbai","Kolkatta","Bangalore","Chennai","Hyderabad");
    System.out.println(list.contains(city)?"IT City":"Not IT City");
  }
}

