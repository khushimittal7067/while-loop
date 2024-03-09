import java.util.*;
public class PorL{

public static void main(String[]args){
Scanner sc = new Scanner(System.in);
   System.out.println("Enter Cost Price");
   int cp = sc.nextInt();
   System.out.println("Enter selling Price");
   int sp = sc.nextInt();
   
   
  if(sp>cp){
       int x = sp-cp;
       System.out.println("profit"+x);
}
else{
     int x = cp-sp;
     System.out.println("loss"+x);
}
}
}