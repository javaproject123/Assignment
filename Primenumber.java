import java.util.Scanner;
public class Primenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int num, i,count =0;
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the value :");
       num=sc.nextInt();
       for(i=2;num>i;i++) {
    	   if(num%i==0) {
    		   count++;
    		   break;
    	   }
       }
          if(count==0)
        	  System.out.println("\n it is a prime number. ");
          else
        	  System.out.println("\n it is not a prime number. ");
	}

}
