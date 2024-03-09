import java.util.*;
public class electric{

public static void main(String[]args){
Scanner sc = new Scanner (System.in);

   int n = sc.nextInt();
   float ans = 0;
   
  if(n<=100){
  ans = n*4;
System.out.println(ans+1.1);
}else if(n<=200){
  ans1 = ans + (n-100)*5;
System.out.println(ans1+1.1);
}else if(n<=300){
  ans2 = ans + ans1 + (n-200)*6;
System.out.println(ans2+1.1);
}else if(n<=400){
  ans3 = ans + ans1 + ans2 + (n-300)*7;
System.out.println(ans3+1.1);
}else{
  ans4 = ans + ans1 + ans2 + ans3 +  (n-100)*8;
System.out.println(ans4+1.1);
}

}

}