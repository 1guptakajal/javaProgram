//CONVERT  AN ORDINARY NUMBER INTO ROMAN NUMBER
import java.util.Scanner;

class RomanNumber{
    int n;
    void get(int x){n=x;}
    void convert(){
        if(n<=0){
            System.out.print("Invalid input.");
        }
        else{
         while(n>=1000){
            System.out.print("M");
            n=n-1000;
         }   
         if(n>=900){
            System.out.print("CM");
            n=n-900;
         }
         if(n>=500){
            System.out.print("D");
            n=n-500;
         }
         if(n>=400){
            System.out.print("CD");
            n=n-400;
         }
         while(n>=100){
            System.out.print("C");
            n=n-100;
         }
         if(n>90){
            System.out.print("XC");
            n=n-90;
         }
         if(n>=50){
            System.out.print("L");
            n=n-50;
         }
         if(n>=40){
            System.out.print("XL");
            n=n-40;
         }
         while(n>=10){
            System.out.print("X");
            n=n-10;
         }
         if(n>=5){
            System.out.print("V");
            n=n-5;
         }
         if(n>=4){
            System.out.print("IV");
            n=-4;
         }
         while(n>=1){
            System.out.print("I");
            n=n-1;
         }
        }
    }
}
public class Test{
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      RomanNumber rn=new RomanNumber();
      rn.get(n);
      rn.convert();
    }
}