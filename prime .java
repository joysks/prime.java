
import java.util.Scanner;

public class Primne {

public static void main(String[] args){

Scanner input=new Scanner(System.in);

System.out.println(" Please input the prime Number :");
int num= input.nextInt();

int count=0;

for ( int i=2;i<num;i++){

   if( num %i==0){
    count ++;
    
   }
 
}
 if (count<0){
   System.out.println("The number is prime"); 


 }
 System.out.println("The number is not prime");

}

}
