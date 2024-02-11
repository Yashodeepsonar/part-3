import java.util.Scanner;
class Cal{
	public static void main(String[] args);
	Scanner a=new Scanner(system.in);
	iSystem.out.println("enter any two number: ");
	int a1=a.next();
	int a2=a.next();
	 System.out.println("enter opaerator: ");
	int op=a.next();
{
	if(op=="+" || op=="-" || op=="/" || op=="*" ){
	 	if(op=="+"){
	  		res=a1+a2;
	  			System.out.pritnln(res);
		}
		if(op=="-"){
	 		 res=a1-a2;
	 			System.out.pritnln(res);
		}
		if(op=="/"){
	  		res=a1/a2;
	  			System.out.pritnln(res);
    	}
		if(op=="*"){
	 	 res=a1*a2;
			  System.out.pritnln(res);
	  	}
	else{

	  System.out.pritnln("Invalid comma");
	}
}
}
}