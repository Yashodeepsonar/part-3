class Test {
	public static void main(String[] args) {
		try
			{
				int a = Integer.parseInt(args[0]);
				int b = Integer.parseInt(args[1]);
				int c = a/b;
				System.out.println("result:" +(a+b));
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println("result:"+(5+6));
			}
			catch(NumberFormatException fe)
			{
				System.out.println("result:"+(8+14));
			}
			catch(ArithmeticException e)
			{
				System.out.println("result:"+(11+12));
			}
			
	}
}