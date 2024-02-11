class FoerEach{
	public static void main(String[] args) {
		int[] marks = {125,132,45,36,34};
		int max =marks[0];
		for (int num:marks){
			if(num>max){
				max=num;
			}
		}
		System.out.println("student highest score is"+max);
	}
}