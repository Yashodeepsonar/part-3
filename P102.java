import java.util.ArrayList;
class Array{
	public static void main(String[] args) {
		ArrayList a=new ArrayList();
		a.add("r");
		a.add(120);
		a.add("r");
		a.add(null);
		System.out.println(a);
		a.remove(2);
		System.out.println(a);
		a.add(2,"h");
		a.add("i");
		System.out.println(a);
		a.removeAll(a);
		System.out.println(a);
	}
}