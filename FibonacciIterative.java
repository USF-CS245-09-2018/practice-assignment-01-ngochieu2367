public class FibonacciIterative implements Fibonacci{

	public int fibonacci(int n){
			int first = 0;
			int second = 1;
			for(int i = 0; i < n; i++){
				int temp = first;
				first = first + second;
				second = temp;
			}
			return first;
			
	}

		
}