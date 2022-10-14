import java.util.Scanner;
public class calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      double num1;
      double num2;
      System.out.println("Enter the first number");
      num1= sc.nextDouble();
      System.out.println("Enter the second number");
      num2= sc.nextDouble();
      System.out.println("addition"+(num1+num2));
      System.out.println("substaction"+(num1-num2));
      System.out.println("multipication"+(num1*num2));
      
	}

}
