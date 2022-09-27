import java.util.*;
public class Program2 {

	public static void main(String[] args) {
	    
	    Scanner scan = new Scanner(System.in);
	    int n = scan.nextInt();
	    int ans = 0;
		
		for(int i = 1; i <= n; i++) 
		{
		  ans = 2 * i - 1;
		  System.out.print( n + ":" + ans + "");
		}
	
	}
}