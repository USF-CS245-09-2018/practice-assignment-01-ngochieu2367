public class FibonacciRecursive implements Fibonacci{

	public int fibonacci(int n){
		if(n == 0 || n == 1)
			return n;
		else
			return fibonacci(n-1) + fibonacci(n-2);
	    
    }
    
    public static void main (String[] args){
    	FibonacciRecursive fib = new FibonacciRecursive();
    	System.out.println(fib.fibonacci(5));
    }
}