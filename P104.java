import java.util.*;
class Array{
	public static void main(String[] args) {
		HashSet<String> s=new HashSet<>();
		s.add("s");
		s.add("r");
		s.add("t");
		s.add("r");
		Iterator<String> itr=s.iterator();
		while(itr.hasNext()){
			String Str=itr.next();
			System.out.println(Str);
		}
		System.out.println(s);
	}

}