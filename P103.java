import java.util.ArrayList;
class Array{
	public static void main(String[] args) {
		ArrayList<String> colour_list=new ArrayList<>(4);
		colour_list.add("white");
		colour_list.add("black");
		colour_list.add("red");
		colour_list.add("yellow");
		colour_list.add("orange");
		System.out.println("------------color list-----------");
		for (int i=0;i<5 ;i++ ) {
			System.out.println(colour_list.get(i).toString());
			
		}
		ArrayList<String> colour=new ArrayList<>(4);
		colour.add("white");
		colour.add("black");
		colour.add("red");
		colour.add("yellow");
		colour.add("orange");
		System.out.println("------------color list1-----------");
		for (int i=0;i<5 ;i++ ) {
			System.out.println(colour.get(i).toString());
		}    -
			
	}
}