import java.util.*;
public class weather{

public static void main(String[]args){

Scanner sc = new Scanner(System.in);

int T = sc.nextInt();

if(T<0){
  System.out.println("Weather is Freezing");

}else if(T<10){
  System.out.println("Weather is very cold");

}else if(T<20){
  System.out.println("Weather is cold");

}else if(T<30){
  System.out.println("Weather is normal temp");

}else if(T<40){
  System.out.println("Weather is Hot");

}else{
  System.out.println("Weather is very hot");
}
}

}