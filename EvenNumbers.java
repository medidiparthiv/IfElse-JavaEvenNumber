import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    
	    Scanner x = new Scanner(System.in);
	    
	    System.out.print("Enter Number : ");
	    int y = x.nextInt();
	    
	    if(y%2== 0){
	        System.out.println("The Number You Entered is Even");
	    }
	    else{
	        System.out.println("The number You Entered is Odd");
	    }
		System.out.println();
	}
}