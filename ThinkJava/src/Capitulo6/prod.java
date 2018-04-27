package Capitulo6;

public class prod {
	
	public static void main(String[] args) {
		System.out.println(prod(1, 4));
		}
	
	public static int prod(int m, int n) {
	/*	if (m == n) {
			return n;
		}
		else {
			int recurse = prod(m, n - 1);
			int result = n * recurse;
			return result;
       return ((m==n)?(n):(n*prod(m, n - 1)));
		}
		*/
		return ((m==n)?(n):(n*prod(m, n - 1)));
	}
}
