import java.util.Arrays;
class Stock{
	public static void main(String[] args) {
		int n[]=new int[]{90,45,34,56,23,23,45};
		int j[]=new int[7];
		j[0]=1;
		int k=1;
	for(int i=1;i<7;i++){
		if(n[i]<n[i-1]) {
			j[k++]=1;

		
	} else if(n[i]==n[i-1]){
		j[k++]=5;
	}
		else{
			j[k++]=2;
		}
	}
	System.out.println(Arrays.toString(j));
	}

}