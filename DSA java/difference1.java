import java.util.*;
public class difference{

   public static void main(String[]args){
   Scanner sc = new Scanner(System.in);
    System.out.println("enter a number");
     int a = sc.nextInt();
    System.out.println("enter b number");
     int b = sc.nextInt();

   if(a>b){
     int y = a-b;
    System.out.println("difference is: "+ y);
}else{
    int z = b-a;
   System.out.println("difference is:  "+z);
}
   
}
}