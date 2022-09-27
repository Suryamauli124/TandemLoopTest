public class Program3 {

	public static void main(String[] args) {
	    
	    
	    int n = 4;
	    int ans = 0;
		if(n % 2 == 1){
		for(int i = 1; i <= n; i++) 
		{
		  ans = 2 * i - 1;
		  System.out.print(ans + " ");
		}
	}
	    else{
	        for(int i = 1; i <= (n - 1); i++) 
		{
		  ans = 2 * i - 1;
		  System.out.print( ans + " ");
		}
	    }
	
	}
}