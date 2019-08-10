public class HelloWorld {
	
	public static void main(String[] args) {
		int var1 = 1;
		int var2 = 2;
		int result = add(var1, var2);
		System.out.println("var1 + var2 = " + result);
	}
	
	public static int add(int var1, int var2) {
		return (var1 + var2);
	}
}